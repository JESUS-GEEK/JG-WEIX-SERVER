package com.jg.wx.service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.jg.wx.dao.DtsCouponMapper;
import com.jg.wx.dao.DtsCouponUserMapper;
import com.jg.wx.domain.DtsCoupon;
import com.jg.wx.domain.DtsCoupon.Column;
import com.jg.wx.domain.DtsCouponExample;
import com.jg.wx.domain.DtsCouponUser;
import com.jg.wx.domain.DtsCouponUserExample;
import com.jg.wx.util.CouponConstant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class DtsCouponService {
	@Resource
	private DtsCouponMapper couponMapper;
	@Resource
	private DtsCouponUserMapper couponUserMapper;

	private Column[] result = new Column[] { Column.id, Column.name, Column.desc, Column.tag, Column.days,
			Column.startTime, Column.endTime, Column.discount, Column.min };

	/**
	 * 查询，空参数
	 *
	 * @param offset
	 * @param limit
	 * @param sort
	 * @param order
	 * @return
	 */
	public List<DtsCoupon> queryList(int offset, int limit, String sort, String order) {
		return queryList(DtsCouponExample.newAndCreateCriteria(), offset, limit, sort, order);
	}

	/**
	 * 查询
	 *
	 * @param criteria
	 *            可扩展的条件
	 * @param offset
	 * @param limit
	 * @param sort
	 * @param order
	 * @return
	 */
	public List<DtsCoupon> queryList(DtsCouponExample.Criteria criteria, int offset, int limit, String sort,
			String order) {
		criteria.andTypeEqualTo(CouponConstant.TYPE_COMMON).andStatusEqualTo(CouponConstant.STATUS_NORMAL)
				.andDeletedEqualTo(false);
		criteria.example().setOrderByClause(sort + " " + order);
		PageHelper.startPage(offset, limit);
		return couponMapper.selectByExampleSelective(criteria.example(), result);
	}

	public int queryTotal() {
		DtsCouponExample example = new DtsCouponExample();
		example.or().andTypeEqualTo(CouponConstant.TYPE_COMMON).andStatusEqualTo(CouponConstant.STATUS_NORMAL)
				.andDeletedEqualTo(false);
		return (int) couponMapper.countByExample(example);
	}

	public List<DtsCoupon> queryAvailableList(Integer userId, int offset, int limit) {
		assert userId != null;
		// 过滤掉登录账号已经领取过的coupon
		DtsCouponExample.Criteria c = DtsCouponExample.newAndCreateCriteria();
		List<DtsCouponUser> used = couponUserMapper
				.selectByExample(DtsCouponUserExample.newAndCreateCriteria().andUserIdEqualTo(userId).example());
		if (used != null && !used.isEmpty()) {
			c.andIdNotIn(used.stream().map(DtsCouponUser::getCouponId).collect(Collectors.toList()));
		}
		return queryList(c, offset, limit, "add_time", "desc");
	}

	public List<DtsCoupon> queryList(int offset, int limit) {
		return queryList(offset, limit, "add_time", "desc");
	}

	public DtsCoupon findById(Integer id) {
		return couponMapper.selectByPrimaryKey(id);
	}

	public DtsCoupon findByCode(String code) {
		DtsCouponExample example = new DtsCouponExample();
		example.or().andCodeEqualTo(code).andTypeEqualTo(CouponConstant.TYPE_CODE)
				.andStatusEqualTo(CouponConstant.STATUS_NORMAL).andDeletedEqualTo(false);
		List<DtsCoupon> couponList = couponMapper.selectByExample(example);
		if (couponList.size() > 1) {
			throw new RuntimeException("");
		} else if (couponList.size() == 0) {
			return null;
		} else {
			return couponList.get(0);
		}
	}

	/**
	 * 查询新用户注册优惠券
	 *
	 * @return
	 */
	public List<DtsCoupon> queryRegister() {
		DtsCouponExample example = new DtsCouponExample();
		example.or().andTypeEqualTo(CouponConstant.TYPE_REGISTER).andStatusEqualTo(CouponConstant.STATUS_NORMAL)
				.andDeletedEqualTo(false);
		return couponMapper.selectByExample(example);
	}

	public List<DtsCoupon> querySelective(String name, Short type, Short status, Integer page, Integer limit,
			String sort, String order) {
		DtsCouponExample example = new DtsCouponExample();
		DtsCouponExample.Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(name)) {
			criteria.andNameLike("%" + name + "%");
		}
		if (type != null) {
			criteria.andTypeEqualTo(type);
		}
		if (status != null) {
			criteria.andStatusEqualTo(status);
		}
		criteria.andDeletedEqualTo(false);

		if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
			example.setOrderByClause(sort + " " + order);
		}

		PageHelper.startPage(page, limit);
		return couponMapper.selectByExample(example);
	}

	public void add(DtsCoupon coupon) {
		coupon.setAddTime(LocalDateTime.now());
		coupon.setUpdateTime(LocalDateTime.now());
		couponMapper.insertSelective(coupon);
	}

	public int updateById(DtsCoupon coupon) {
		coupon.setUpdateTime(LocalDateTime.now());
		return couponMapper.updateByPrimaryKeySelective(coupon);
	}

	public void deleteById(Integer id) {
		couponMapper.logicalDeleteByPrimaryKey(id);
	}

	private String getRandomNum(Integer num) {
		String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		base += "0123456789";

		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 生成优惠码
	 *
	 * @return 可使用优惠码
	 */
	public String generateCode() {
		String code = getRandomNum(8);
		while (findByCode(code) != null) {
			code = getRandomNum(8);
		}
		return code;
	}

	/**
	 * 查询过期的优惠券: 注意：如果timeType=0, 即基于领取时间有效期的优惠券，则优惠券不会过期
	 *
	 * @return
	 */
	public List<DtsCoupon> queryExpired() {
		DtsCouponExample example = new DtsCouponExample();
		example.or().andStatusEqualTo(CouponConstant.STATUS_NORMAL).andTimeTypeEqualTo(CouponConstant.TIME_TYPE_TIME)
				.andEndTimeLessThan(LocalDate.now()).andDeletedEqualTo(false);
		return couponMapper.selectByExample(example);
	}

	/**
	 * 查询用户的优惠券
	 * @param userId
	 * @return
	 */
	public int queryUserCouponCnt(Integer userId) {
		DtsCouponUserExample example = new DtsCouponUserExample();
		DtsCouponUserExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andDeletedEqualTo(false);
		return (int) couponUserMapper.countByExample(example);
	}
}

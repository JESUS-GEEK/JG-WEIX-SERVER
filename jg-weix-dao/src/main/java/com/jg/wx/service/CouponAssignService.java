package com.jg.wx.service;

import com.jg.wx.domain.DtsCoupon;
import com.jg.wx.domain.DtsCouponUser;
import com.jg.wx.util.CouponConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CouponAssignService {

	@Autowired
	private DtsCouponUserService couponUserService;
	@Autowired
	private DtsCouponService couponService;

	/**
	 * 分发注册优惠券
	 *
	 * @param userId
	 * @return
	 */
	public void assignForRegister(Integer userId) {
		List<DtsCoupon> couponList = couponService.queryRegister();
		for (DtsCoupon coupon : couponList) {
			Integer couponId = coupon.getId();

			Integer count = couponUserService.countUserAndCoupon(userId, couponId);
			if (count > 0) {
				continue;
			}

			Short limit = coupon.getLimit();
			while (limit > 0) {
				DtsCouponUser couponUser = new DtsCouponUser();
				couponUser.setCouponId(couponId);
				couponUser.setUserId(userId);
				Short timeType = coupon.getTimeType();
				if (timeType.equals(CouponConstant.TIME_TYPE_TIME)) {
					couponUser.setStartTime(coupon.getStartTime());
					couponUser.setEndTime(coupon.getEndTime());
				} else {
					LocalDate now = LocalDate.now();
					couponUser.setStartTime(now);
					couponUser.setEndTime(now.plusDays(coupon.getDays()));
				}
				couponUserService.add(couponUser);

				limit--;
			}
		}

	}

}
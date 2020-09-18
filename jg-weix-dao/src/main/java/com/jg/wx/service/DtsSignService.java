package com.jg.wx.service;

import com.jg.wx.dao.DtsSignMapper;
import com.jg.wx.domain.DtsSign;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: DtsSignService</p>
 * <p>Company: </p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-08-30 15:33
 */
@Service
public class DtsSignService {

    @Resource
    private DtsSignMapper dtsSignMapper;

    /**
     * 插入
     *
     * @param record 記錄
     * @return 插入个数
     */
    public int insert(DtsSign record) {
        return dtsSignMapper.insertSelective(record);
    }

    public List<DtsSign> getByUserId(String userId) {
        return dtsSignMapper.selectByUserId(userId);
    }


    /**
     * 判断当天是否签到
     *
     * @return 结果
     */
    public boolean iSignInToDay(String userId) {
        DtsSign dtsSign = dtsSignMapper.signInToDay(userId);
        return dtsSign != null;
    }


}

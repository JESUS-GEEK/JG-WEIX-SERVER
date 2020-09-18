package com.jg.wx.service;

import com.jg.wx.dao.JgOdFeeMapper;
import com.jg.wx.domain.JgOdFee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>Title: JgOdFeeService</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 13:53
 */
@Service
public class JgOdFeeService {

    @Resource
    JgOdFeeMapper jgOdFeeMapper;

    /**
     * 按id获取对应的车费权重
     *
     * @param catType id
     * @return obj
     */
    public JgOdFee selectByType(Integer catType) {
        return jgOdFeeMapper.selectByPrimaryKey(catType);
    }

    /**
     * 获取所有车型
     *
     * @return all cat
     */
    public List<Map<String, Object>> selectCarDim() {
        return jgOdFeeMapper.selectCarDim();
    }

}

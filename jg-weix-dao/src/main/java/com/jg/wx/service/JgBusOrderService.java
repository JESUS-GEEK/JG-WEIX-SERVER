package com.jg.wx.service;

import com.jg.wx.dao.JgBusOrderMapper;
import com.jg.wx.domain.JgBusOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Title: JgBusOrderService</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 15:45
 */
@Service
public class JgBusOrderService {

    @Resource
    JgBusOrderMapper jgBusOrderMapper;

    public int insert(JgBusOrder jgBusOrder) {
        return jgBusOrderMapper.insertSelective(jgBusOrder);
    }
}

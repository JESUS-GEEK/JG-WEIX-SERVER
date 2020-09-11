package com.jg.wx.service;

import com.jg.wx.dao.DtsAboutMeMapper;
import com.jg.wx.domain.DtsAboutMe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Title: DtsAboutMeService</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-08-31 09:23
 */
@Service
public class DtsAboutMeService {
    @Resource
    DtsAboutMeMapper dtsAboutMeMapper;


    /**
     * 查询企业简介
     *
     * @return 企业简介
     */
    public DtsAboutMe query (int corpId) {
        return dtsAboutMeMapper.selectByPrimaryKey(corpId);
    }



}

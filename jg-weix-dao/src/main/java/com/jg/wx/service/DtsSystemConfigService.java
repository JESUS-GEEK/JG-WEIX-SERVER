package com.jg.wx.service;

import com.jg.wx.dao.DtsSystemMapper;
import com.jg.wx.domain.DtsSystem;
import com.jg.wx.domain.DtsSystemExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DtsSystemConfigService {
	@Resource
	private DtsSystemMapper systemMapper;

	public List<DtsSystem> queryAll() {
		DtsSystemExample example = new DtsSystemExample();
		example.or();
		return systemMapper.selectByExample(example);
	}
}

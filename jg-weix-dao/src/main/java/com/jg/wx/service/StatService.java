package com.jg.wx.service;

import com.jg.wx.dao.ex.StatMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("rawtypes")
public class StatService {
	@Resource
	private StatMapper statMapper;

	public List<Map> statUser() {
		return statMapper.statUser();
	}

	public List<Map> statOrder() {
		return statMapper.statOrder();
	}

	public List<Map> statGoods() {
		return statMapper.statGoods();
	}
}

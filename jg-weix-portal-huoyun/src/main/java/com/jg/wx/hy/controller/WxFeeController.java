package com.jg.wx.hy.controller;

import com.jg.wx.core.util.ResponseUtil;
import com.jg.wx.domain.JgOdFee;
import com.jg.wx.hy.util.GeoUtil;
import com.jg.wx.service.JgOdFeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>Title: WxFeeController</p>
 * <p>Description:
 * 描述：费用计算
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 11:23
 */
@RestController
@RequestMapping(value = "/api/fee/")
public class WxFeeController {

    @Resource
    JgOdFeeService jgOdFeeService;

    private static final Logger logger = LoggerFactory.getLogger(WxFeeController.class);


    /**
     * 经纬度费用计算
     *
     * @param lng1 lng1
     * @param lat1 lat1
     * @param lng2 lng2
     * @param lat2 lat2
     * @return odFee
     */
    @GetMapping("getOdFee")
    public Object getOdFee(double lng1, double lat1, double lng2, double lat2, int catType) {
        try {
            double distance = GeoUtil.getDistance(lng1, lat1, lng2, lat2);
            logger.info("od距离: {}米", distance);
            JgOdFee jgOdFee = jgOdFeeService.selectByType(catType);
            Double feeWeight = jgOdFee.getFeeWeight();
            return ResponseUtil.ok((distance / 1000) * feeWeight);
        }
        catch (Exception e) {
            logger.error("经纬度计算失败: {}", e.getMessage());
            return ResponseUtil.fail();
        }
    }

    @GetMapping("getCatFee")
    public Object getCatFee(int catType) {
        try {
            JgOdFee jgOdFee = jgOdFeeService.selectByType(catType);
            return ResponseUtil.ok(jgOdFee);
        }
        catch (Exception e) {
            logger.error("失败: {}", e.getMessage());
            return ResponseUtil.fail();
        }
    }


    @GetMapping("getAllCarInfo")
    public Object getAllCarInfo() {
        try {
            List<Map<String, Object>> maps = jgOdFeeService.selectCarDim();
            return ResponseUtil.ok(maps);
        }
        catch (Exception e) {
            logger.error("获取失败: {}", e.getMessage());
            return ResponseUtil.fail();
        }
    }

}

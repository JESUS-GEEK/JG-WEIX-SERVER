package com.jg.wx.hy.controller;

import com.jg.wx.core.util.ResponseUtil;
import com.jg.wx.domain.JgOdFee;
import com.jg.wx.hy.util.GeoUtil;
import com.jg.wx.service.JgOdFeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Api(value = "费用", tags = {"费用"})
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
    @ApiOperation(value = "od按车型,距离计算费用", notes = "费用计算-经纬度")
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
    @ApiOperation(value = "车信息费用", notes = "指定车信息费用")
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
    @ApiOperation(value = "所有车信息", notes = "车-信息")
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

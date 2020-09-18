package com.jg.wx.hy.controller;

import com.jg.wx.core.util.ResponseUtil;
import com.jg.wx.domain.JgBusOrder;
import com.jg.wx.domain.JgOdFee;
import com.jg.wx.hy.util.GeoUtil;
import com.jg.wx.service.JgBusOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: WxOrderController</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 15:47
 */
@RestController
@RequestMapping(value = "/api/order/")
@Api(value = "订单", tags = {"订单"})
public class WxOrderController {

    @Autowired
    JgBusOrderService jgBusOrderService;

    private static final Logger logger = LoggerFactory.getLogger(WxOrderController.class);

    /**
     * 班车下单
     *
     * @param jgBusOrder jgBusOrder
     * @return insert num
     */
    @GetMapping("insert")
    @ApiOperation(value = "班车下单保存", notes = "班车下单保存")
    public Object insert(@RequestBody JgBusOrder jgBusOrder) {
        try {
            return ResponseUtil.ok(jgBusOrderService.insert(jgBusOrder));
        }
        catch (Exception e) {
            logger.error("班车下单插入失败: {}", e.getMessage());
            return ResponseUtil.fail();
        }
    }

}

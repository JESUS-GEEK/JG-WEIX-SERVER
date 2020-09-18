package com.jg.wx.hy.controller;

import com.alibaba.fastjson.JSONObject;
import com.jg.wx.core.util.ResponseUtil;
import com.jg.wx.domain.DtsSign;
import com.jg.wx.service.DtsSignService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>Title: WxSignController</p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-08-30 15:13
 */

@RestController
@RequestMapping("/wx/sign")
@Api(value = "签到", tags = {"签到"})
public class WxSignController {

    private DtsSignService dtsSignService;

    @Autowired
    public WxSignController(DtsSignService dtsSignService) {
        this.dtsSignService = dtsSignService;
    }

    @GetMapping("in")
    public Object signIn(@RequestParam("userId") String userId) {
        // 1. 判断今天是否签到
        boolean iSignInToDay = dtsSignService.iSignInToDay(userId);

        if (iSignInToDay) {
            return ResponseUtil.fail(-2, "今日已签到");
        }

        DtsSign dtsSign = new DtsSign();
        dtsSign.setUserId(userId);
        dtsSignService.insert(dtsSign);
        return ResponseUtil.ok("签到成功");
    }

    @GetMapping("query")
    public Object query(@RequestParam("userId") String userId) {
        int signScore;
        int weekNumDay = 7;
        // 1. 按用户查询签到信息
        List<DtsSign> signList = dtsSignService.getByUserId(userId);
        int signDayNums = getContinuousSignInDay(signList);
        if (signDayNums < weekNumDay) {
            signScore = signDayNums;
        }
        else {
            signScore = (signDayNums - 6) * 3 + 6;
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("signDay", signDayNums);
        jsonObject.put("signScore", signScore);
        return ResponseUtil.ok(jsonObject);
    }

    private int getContinuousSignInDay(List<DtsSign> signList) {
        //continuousDay 连续签到数
        int continuousDay = 1;
        boolean todaySignIn = false;
        Date today = new Date();
        for (int i = 0; i < signList.size(); i++) {
            DtsSign signIn = signList.get(i);
            int intervalDay = distanceDay(today, signIn.getSignTime());
            //当天签到
            if (intervalDay == 0 && i == 0) {
                todaySignIn = true;
            }
            else if (intervalDay == continuousDay) {
                continuousDay++;
            }
            else {
                //不连续，终止判断
                break;
            }
        }
        if (!todaySignIn) {
            continuousDay--;
        }
        return continuousDay;
    }

    /**
     * 两个日期对比间隔天数
     *
     * @param largeDay largeDay
     * @param smallDay smallDay
     * @return distanceDay
     */
    private int distanceDay(Date largeDay, Date smallDay) {
        return (int) ((largeDay.getTime() - smallDay.getTime()) / (1000 * 60 * 60 * 24));
    }

}

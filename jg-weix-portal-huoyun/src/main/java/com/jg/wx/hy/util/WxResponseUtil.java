package com.jg.wx.hy.util;

import com.jg.wx.core.util.ResponseUtil;

/**
 * <p>Title: WxResponseUtil</p>
 * <p>Description: 微信接口枚举信息的响应
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 10:52
 */
public class WxResponseUtil extends ResponseUtil {

    /**
     * 按枚举返回错误响应结果.
     *
     * @param responseCode responseCode
     * @return Object
     */
    public static Object fail(WxResponseCode responseCode) {
        return fail(responseCode.code(), responseCode.desc());
    }

}

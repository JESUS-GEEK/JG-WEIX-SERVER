package com.jg.wx.hy.service;

import com.jg.wx.domain.DtsUser;
import com.jg.wx.hy.dao.UserInfo;
import com.jg.wx.service.DtsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * <p>Title: UserInfoService</p>
 * <p>Company: </p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 10:34
 */
public class UserInfoService {
    @Autowired
    private DtsUserService userService;

    public UserInfo getInfo(Integer userId) {
        DtsUser user = userService.findById(userId);
        Assert.state(user != null, "用户不存在");
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(user.getNickname());
        userInfo.setAvatarUrl(user.getAvatar());
        return userInfo;
    }
}

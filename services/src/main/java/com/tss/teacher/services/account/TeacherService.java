package com.tss.teacher.services.account;

import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.teacher.interfaces.account.TeacherInterface;
import com.tss.teacher.interfaces.account.vo.LoginUserInfoRespVO;
import com.tss.teacher.interfaces.account.vo.LoginUserInfoVO;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;
import com.tss.teacher.services.account.feign.TeacherFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class TeacherService implements TeacherInterface {

    @Autowired
    private TeacherFeignService teacherFeignService;

    @Override
    public LoginUserInfoRespVO doLogin(HttpServletResponse response, UserIdentityVO userIdentity) {
        LoginUserInfoVO loginUserInfo = teacherFeignService.doLogin(userIdentity);
        this.setCookie(response, loginUserInfo.getCookieInfo());
        return ModelMapperUtil.strictMap(loginUserInfo, LoginUserInfoRespVO.class);
    }

    // 浏览器不存储cookie
    private void setCookie(HttpServletResponse response, LoginUserInfoVO.CookieInfo cookieInfo) {
        Cookie cookie = new Cookie(cookieInfo.getCookieName(), cookieInfo.getCookieValue());
        cookie.setPath(cookieInfo.getCookiePath());
        cookie.setDomain(cookieInfo.getCookieDomain());
        response.addCookie(cookie);
    }
}

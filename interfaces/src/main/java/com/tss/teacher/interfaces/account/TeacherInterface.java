package com.tss.teacher.interfaces.account;

import com.tss.teacher.interfaces.account.vo.LoginUserInfoRespVO;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;

import javax.servlet.http.HttpServletResponse;

public interface TeacherInterface {
    LoginUserInfoRespVO doLogin(HttpServletResponse response, UserIdentityVO userIdentity);
}

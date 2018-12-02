package com.tss.teacher.interfaces.account;

import com.tss.teacher.interfaces.account.vo.LoginUserInfoVO;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;

public interface TeacherInterface {
    LoginUserInfoVO doLogin(UserIdentityVO userIdentity);
}

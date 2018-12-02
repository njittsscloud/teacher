package com.tss.teacher.services.account;

import com.tss.teacher.interfaces.account.TeacherInterface;
import com.tss.teacher.interfaces.account.vo.LoginUserInfoVO;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;
import com.tss.teacher.services.account.feign.TeacherFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements TeacherInterface {

    @Autowired
    private TeacherFeignService teacherFeignService;

    @Override
    public LoginUserInfoVO doLogin(UserIdentityVO userIdentity) {
        return teacherFeignService.doLogin(userIdentity);
    }
}

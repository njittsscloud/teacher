package com.tss.teacher.web.account;

import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.teacher.interfaces.account.TeacherInterface;
import com.tss.teacher.interfaces.account.vo.LoginUserInfoVO;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "教师模块", tags = "TeacherController", description = "教师模块")
@RestController
@RequestMapping("/account/teacher")
public class TeacherController {
    private static final Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    private TeacherInterface teacherInterface;

    @ApiOperation(value = "教师登录", notes = "教师登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginUserInfoVO login(@JsonParam(validation = true) UserIdentityVO userIdentity) {
        return teacherInterface.doLogin(userIdentity);
    }

//    @ApiOperation(value = "获取用户基本信息", notes = "获取用户基本信息")
//    @RequestMapping(value = "/getUserBaseInfoById/{id}", method = RequestMethod.GET)
//    public UserBaseInfo getUserBaseInfo(@PathVariable Long id) {
//        return teacherService.getUserBaseInfoById(id);
//    }


}

package com.tss.teacher.web.account.teacher;

import com.tss.teacher.interfaces.account.teacher.vo.UserBaseInfo;
import com.tss.teacher.services.account.teacher.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "教师模块", tags = "TeacherController", description = "教师模块")
@RestController
public class TeacherController {
    private static final Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "获取用户基本信息", notes = "获取用户基本信息")
    @RequestMapping(value = "/getUserBaseInfoById/{id}", method = RequestMethod.GET)
    public UserBaseInfo getUserBaseInfo(@PathVariable Long id) {
        return teacherService.getUserBaseInfoById(id);
    }


}

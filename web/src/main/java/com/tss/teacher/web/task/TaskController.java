package com.tss.teacher.web.task;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.teacher.interfaces.task.TaskInterface;
import com.tss.teacher.interfaces.task.vo.TeacherTaskReqVO;
import com.tss.teacher.interfaces.task.vo.TeacherTaskRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "实验任务模块", tags = "TaskController", description = "实验任务模块")
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskInterface taskInterface;

    @ApiOperation(value = "教师实验任务列表", notes = "教师实验任务列表（分页）")
    @RequestMapping(value = "/getTaskList", method = RequestMethod.POST)
    public PageInfo<TeacherTaskRespVO> getTaskList(@JsonParam(validation = true) TeacherTaskReqVO param) {
        return taskInterface.getTeacherTaskList(param);
    }
}

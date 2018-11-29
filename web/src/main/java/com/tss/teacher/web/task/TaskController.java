package com.tss.teacher.web.task;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.teacher.interfaces.task.TaskInterface;
import com.tss.teacher.interfaces.task.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @ApiOperation(value = "实验任务详情", notes = "实验任务详情")
    @RequestMapping(value = "/getTaskDetail", method = RequestMethod.POST)
    public TaskDetailRespVO getTaskDetail(@JsonParam(validation = true) TaskDetailReqVO param) {
        return taskInterface.getTaskDetail(param);
    }

    @ApiOperation(value = "教师创建实验任务", notes = "创建实验任务")
    @RequestMapping(value = "/createTask", method = RequestMethod.POST)
    public Long createTask(@JsonParam(validation = true) TaskCreateReqVO param) {
        return taskInterface.createTask(param);
    }

    @ApiOperation(value = "教师更新实验任务", notes = "更新实验任务")
    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    public Boolean updateTask(@JsonParam(validation = true) TaskUpdateReqVO param) {
        return taskInterface.updateTask(param);
    }

    @ApiOperation(value = "教师发布实验任务", notes = "发布实验任务")
    @RequestMapping(value = "/publishTask/{taskId}", method = RequestMethod.GET)
    public Boolean publishTask(@PathVariable("taskId") Long taskId) {
        return taskInterface.publishTask(taskId);
    }
}

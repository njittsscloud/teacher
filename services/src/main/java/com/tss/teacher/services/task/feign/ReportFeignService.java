package com.tss.teacher.services.task.feign;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.task.vo.*;
import com.tss.teacher.services.task.feign.fallback.ReportFeignServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: MQG
 * @date: 2018/11/28
 */
@FeignClient(value = "${report.serviceId}", fallback = ReportFeignServiceFallback.class)
public interface ReportFeignService {

    @RequestMapping(value = "/task/teacher/getTaskList", method = RequestMethod.POST)
    PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param);

    @RequestMapping(value = "/task/teacher/getTaskDetail", method = RequestMethod.POST)
    TaskDetailRespVO getTaskDetail(TaskDetailReqVO param);

    @RequestMapping(value = "/task/teacher/createTask", method = RequestMethod.POST)
    Long createTask(TaskCreateReqVO param);

    @RequestMapping(value = "/task/teacher/updateTask", method = RequestMethod.POST)
    Boolean updateTask(TaskUpdateReqVO param);

    @RequestMapping(value = "/task/teacher/getTaskDetail", method = RequestMethod.GET)
    Boolean publishTask(Long taskId);
}
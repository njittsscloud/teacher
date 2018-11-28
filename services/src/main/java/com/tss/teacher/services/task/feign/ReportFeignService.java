package com.tss.teacher.services.task.feign;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.task.vo.TeacherTaskReqVO;
import com.tss.teacher.interfaces.task.vo.TeacherTaskRespVO;
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
}
package com.tss.teacher.services.report.feign;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.report.vo.*;
import com.tss.teacher.interfaces.task.vo.*;
import com.tss.teacher.services.report.feign.fallback.ReportFeignServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: MQG
 * @date: 2018/11/28
 */
@FeignClient(value = "${report.serviceId}", fallback = ReportFeignServiceFallback.class)
public interface ReportFeignService {

    @RequestMapping(value = "/report/teacher/getTeacherReportList", method = RequestMethod.POST)
    PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param);

    @RequestMapping(value = "/report/teacher/correctReport", method = RequestMethod.POST)
    Boolean teacherCorrectReport(TeacherCorrectReportReqVO param);

    @RequestMapping(value = "/report/teacher/publishReport", method = RequestMethod.POST)
    Boolean teacherPublishReport(TeacherPublishReportReqVO param);

    @RequestMapping(value = "/report/teacher/getCorrectInfoByReportId/{reportId}", method = RequestMethod.GET)
    GetReportCorrectInfoByReportIdRespVO getReportCorrectInfoByReportId(@PathVariable("reportId") Long reportId);

}
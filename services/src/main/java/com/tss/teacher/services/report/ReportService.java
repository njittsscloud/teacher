package com.tss.teacher.services.report;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.report.ReportInterface;
import com.tss.teacher.interfaces.report.vo.*;
import com.tss.teacher.services.report.feign.ReportFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MQG
 * @date 2018/12/02
 * */
@Service
public class ReportService implements ReportInterface {
    private static final Logger LOG = LoggerFactory.getLogger(ReportService.class);

    @Autowired
    private ReportFeignService reportFeignService;

    @Override
    public PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param) {
        return reportFeignService.getTeacherReportList(param);
    }

    @Override
    public Boolean teacherCorrectReport(TeacherCorrectReportReqVO param) {
        return reportFeignService.teacherCorrectReport(param);
    }

    @Override
    public Boolean teacherPublishReport(TeacherPublishReportReqVO param) {
        return reportFeignService.teacherPublishReport(param);
    }

    @Override
    public GetReportCorrectInfoByReportIdRespVO getReportCorrectInfoByReportId(Long reportId) {
        return reportFeignService.getReportCorrectInfoByReportId(reportId);
    }
}

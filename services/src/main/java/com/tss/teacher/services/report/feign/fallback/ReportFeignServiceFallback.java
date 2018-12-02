package com.tss.teacher.services.report.feign.fallback;

import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.JsonUtil;
import com.tss.teacher.interfaces.report.vo.*;
import com.tss.teacher.interfaces.task.vo.*;
import com.tss.teacher.services.report.feign.ReportFeignService;
import com.tss.teacher.services.task.feign.TaskFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportFeignServiceFallback implements ReportFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(ReportFeignServiceFallback.class);

    @Override
    public PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param) {
        LOG.error("teacher getTeacherReportList fail, param={}", JsonUtil.obj2json(param));
        return null;
    }

    @Override
    public Boolean teacherCorrectReport(TeacherCorrectReportReqVO param) {
        LOG.error("teacher teacherCorrectReport fail, param={}", JsonUtil.obj2json(param));
        return Boolean.FALSE;
    }

    @Override
    public Boolean teacherPublishReport(TeacherPublishReportReqVO param) {
        LOG.error("teacher teacherPublishReport fail, param={}", JsonUtil.obj2json(param));
        return Boolean.FALSE;
    }

    @Override
    public GetReportCorrectInfoByReportIdRespVO getReportCorrectInfoByReportId(Long reportId) {
        LOG.error("teacher getReportCorrectInfoByReportId fail, reportId={}", reportId);
        return null;
    }
}

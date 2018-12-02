package com.tss.teacher.interfaces.report;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.report.vo.*;

/**
 * @author MQG
 * @date 2018/12/02
 * */
public interface ReportInterface {
    PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param);

    Boolean teacherCorrectReport(TeacherCorrectReportReqVO param);

    Boolean teacherPublishReport(TeacherPublishReportReqVO param);

    GetReportCorrectInfoByReportIdRespVO getReportCorrectInfoByReportId(Long reportId);
}

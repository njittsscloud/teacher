package com.tss.teacher.web.report;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.basic.site.user.annotation.TeacherLoginUser;
import com.tss.basic.site.user.annotation.TeacherUser;
import com.tss.teacher.interfaces.report.ReportInterface;
import com.tss.teacher.interfaces.report.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "实验报告模块", tags = "ReportController", description = "实验报告模块")
@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportInterface reportInterface;

    @ApiOperation(value = "教师查询报告列表", notes = "教师查询报告列表")
    @RequestMapping(value = "/getTeacherReportList", method = RequestMethod.POST)
    public PageInfo<TeacherReportRespVO> getTeacherReportList(@JsonParam(validation = true) TeacherReportReqVO param, @ApiIgnore @TeacherLoginUser TeacherUser loginUser) {
        param.setTeacherId(loginUser.getTeacherId());
        return reportInterface.getTeacherReportList(param);
    }

    @ApiOperation(value = "教师批阅报告", notes = "教师批阅报告")
    @RequestMapping(value = "/correctReport", method = RequestMethod.POST)
    public Boolean correctReport(@JsonParam(validation = true) TeacherCorrectReportReqVO param, @ApiIgnore @TeacherLoginUser TeacherUser loginUser) {
        param.setTeacherId(loginUser.getTeacherId());
        return reportInterface.teacherCorrectReport(param);
    }

    @ApiOperation(value = "教师发布成绩", notes = "教师发布成绩")
    @RequestMapping(value = "/publishReport", method = RequestMethod.POST)
    public Boolean correctReport(@JsonParam(validation = true) TeacherPublishReportReqVO param, @ApiIgnore @TeacherLoginUser TeacherUser loginUser) {
        param.setTeacherId(loginUser.getTeacherId());
        return reportInterface.teacherPublishReport(param);
    }

    @ApiOperation(value = "根据报告id查询报告批阅信息", notes = "根据报告id查询报告批阅信息（批阅页面）")
    @RequestMapping(value = "/getCorrectInfoByReportId/{reportId}", method = RequestMethod.GET)
    public GetReportCorrectInfoByReportIdRespVO getReportDetailByReportId(@PathVariable Long reportId, @ApiIgnore @TeacherLoginUser TeacherUser loginUser) {
        return reportInterface.getReportCorrectInfoByReportId(reportId);
    }

}

package com.tss.teacher.services.task.feign.fallback;

import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.JsonUtil;
import com.tss.teacher.interfaces.task.vo.TeacherTaskReqVO;
import com.tss.teacher.interfaces.task.vo.TeacherTaskRespVO;
import com.tss.teacher.services.task.feign.ReportFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportFeignServiceFallback implements ReportFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(ReportFeignServiceFallback.class);

    @Override
    public PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param) {
        LOG.error("getTeacherTaskList fail, param={}", JsonUtil.obj2json(param));
        return new PageInfo<>();
    }
}

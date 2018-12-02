package com.tss.teacher.services.task.feign.fallback;

import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.JsonUtil;
import com.tss.teacher.interfaces.task.vo.*;
import com.tss.teacher.services.task.feign.TaskFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskFeignServiceFallback implements TaskFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(TaskFeignServiceFallback.class);

    @Override
    public PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param) {
        LOG.error("teacher getTeacherTaskList fail, param={}", JsonUtil.obj2json(param));
        return null;
    }

    @Override
    public TaskDetailRespVO getTaskDetail(TaskDetailReqVO param) {
        LOG.error("teacher getTaskDetail fail, param={}", JsonUtil.obj2json(param));
        return null;
    }

    @Override
    public Long createTask(TaskCreateReqVO param) {
        LOG.error("teacher createTask fail, param={}", JsonUtil.obj2json(param));
        return -1L;
    }

    @Override
    public Boolean updateTask(TaskUpdateReqVO param) {
        LOG.error("teacher updateTask fail, param={}", JsonUtil.obj2json(param));
        return Boolean.FALSE;
    }

    @Override
    public Boolean publishTask(Long taskId) {
        LOG.error("teacher publishTask fail, taskId={}", taskId);
        return Boolean.FALSE;
    }
}

package com.tss.teacher.services.task;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.task.TaskInterface;
import com.tss.teacher.interfaces.task.vo.TeacherTaskReqVO;
import com.tss.teacher.interfaces.task.vo.TeacherTaskRespVO;
import com.tss.teacher.services.task.feign.ReportFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: MQG
 * @date: 2018/11/28
 */
@Service
public class TaskService implements TaskInterface {
    private static final Logger LOG = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private ReportFeignService reportFeignService;
    
    @Override
    public PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param) {
        return reportFeignService.getTeacherTaskList(param);
    }
}

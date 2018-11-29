package com.tss.teacher.interfaces.task;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.task.vo.*;

public interface TaskInterface {

    PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param);

    TaskDetailRespVO getTaskDetail(TaskDetailReqVO param);

    Long createTask(TaskCreateReqVO param);

    Boolean updateTask(TaskUpdateReqVO param);

    Boolean publishTask(Long taskId);
}

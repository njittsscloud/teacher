package com.tss.teacher.interfaces.task;

import com.github.pagehelper.PageInfo;
import com.tss.teacher.interfaces.task.vo.TeacherTaskReqVO;
import com.tss.teacher.interfaces.task.vo.TeacherTaskRespVO;

public interface TaskInterface {

    PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param);
}

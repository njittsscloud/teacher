package com.tss.teacher.services.account.teacher.hystrix;

import com.tss.teacher.services.account.teacher.TeacherService;
import com.tss.teacher.interfaces.account.teacher.vo.UserBaseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: MQG
 * @date: 2018/10/17
 */
//@Component
public class TeacherInterfaceFallback implements TeacherService {
    private static final Logger LOG = LoggerFactory.getLogger(TeacherInterfaceFallback.class);
    
    @Override
    public UserBaseInfo getUserBaseInfoById(Long id) {
        LOG.info("访问服务出错, 根据id获取用户基本信息, id={}", id);
        
        UserBaseInfo userBaseInfo = new UserBaseInfo();
        userBaseInfo.setId(0L);
        userBaseInfo.setName("");
        return userBaseInfo;
    }
}

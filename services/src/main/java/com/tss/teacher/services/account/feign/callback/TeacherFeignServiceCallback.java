package com.tss.teacher.services.account.feign.callback;

import com.tss.basic.common.util.JsonUtil;
import com.tss.teacher.interfaces.account.vo.LoginUserInfoVO;
import com.tss.teacher.interfaces.account.vo.UserBaseInfo;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;
import com.tss.teacher.services.account.feign.TeacherFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TeacherFeignServiceCallback implements TeacherFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(TeacherFeignServiceCallback.class);

    @Override
    public UserBaseInfo getUserBaseInfoById(Long id) {
        LOG.error("teacher getUserBaseInfoById fail, id={}", id);
        return null;
    }

    @Override
    public LoginUserInfoVO doLogin(UserIdentityVO param) {
        LOG.error("teacher login fail, param={}", JsonUtil.obj2json(param));
        return null;
    }
}

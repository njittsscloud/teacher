package com.tss.teacher.services.account.feign;


import com.tss.teacher.interfaces.account.vo.LoginUserInfoVO;
import com.tss.teacher.interfaces.account.vo.UserBaseInfo;
import com.tss.teacher.interfaces.account.vo.UserIdentityVO;
import com.tss.teacher.services.account.feign.callback.TeacherFeignServiceCallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${account.serviceId}", fallback = TeacherFeignServiceCallback.class)
public interface TeacherFeignService {

    @RequestMapping(value = "/teacher/login", method = RequestMethod.POST)
    LoginUserInfoVO doLogin(UserIdentityVO userIdentity);

    @RequestMapping(value = "/getUserBaseInfoById/{id}", method = RequestMethod.GET)
    UserBaseInfo getUserBaseInfoById(@PathVariable("id") Long id);

}

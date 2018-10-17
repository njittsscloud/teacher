package com.tss.teacher.services.account.teacher;


import com.tss.teacher.interfaces.account.teacher.vo.UserBaseInfo;
import com.tss.teacher.services.account.teacher.hystrix.TeacherInterfaceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${account.serviceId}", path = "${account.contextPath}", fallback = TeacherInterfaceFallback.class)
public interface TeacherService {

    @RequestMapping(value = "/getUserBaseInfoById/{id}", method = RequestMethod.GET)
    UserBaseInfo getUserBaseInfoById(@PathVariable("id") Long id);
}

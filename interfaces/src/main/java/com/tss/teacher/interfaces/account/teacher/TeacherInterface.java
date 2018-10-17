package com.tss.teacher.interfaces.account.teacher;


import com.tss.teacher.interfaces.account.teacher.vo.UserBaseInfo;
import com.tss.teacher.services.account.teacher.hystrix.TeacherInterfaceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "${account.serviceId}", fallback = TeacherInterfaceFallback.class)
public interface TeacherInterface {
    UserBaseInfo getUserBaseInfoById(Long id);
}

package cn.yangxy.cloud.system.user;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${cloud.server.system}", path = "/user")
public interface UserFeignClient extends UserApi {
}

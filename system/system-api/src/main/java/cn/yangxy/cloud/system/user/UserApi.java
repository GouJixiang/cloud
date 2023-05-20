package cn.yangxy.cloud.system.user;

import org.springframework.web.bind.annotation.RequestMapping;

public interface UserApi {

    @RequestMapping("/printf")
    public String printf();

}

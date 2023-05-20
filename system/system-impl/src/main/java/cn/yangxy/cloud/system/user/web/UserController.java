package cn.yangxy.cloud.system.user.web;

import cn.yangxy.cloud.system.user.UserApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController implements UserApi {

    @Override
    @RequestMapping("/printf")
    public String printf() {
        return "Hello World!";
    }
}

package cn.yangxy.cloud.system.user.web;

import cn.yangxy.cloud.system.user.UserApi;
import cn.yangxy.cloud.system.user.entity.UserEntity;
import cn.yangxy.cloud.system.user.repository.UserRepository;
import jakarta.annotation.Resource;
import jakarta.websocket.server.PathParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController implements UserApi {

    @Resource
    private UserRepository userRepository;

    private final static Logger log = LoggerFactory.getLogger(UserController.class);

    @Override
    @RequestMapping("/printf")
    public String printf() {
        List<UserEntity> userList = userRepository.findAll();
        if (userList.isEmpty())
            return "数据库无数据";
        return userList.get(0).getFullName();
    }

    @ResponseBody
    @GetMapping("/save/{userName}/{loginName}")
    public UserEntity saveUser(@PathVariable String userName, @PathVariable String loginName) {
        log.info("前端传递参数为：" + userName);
        UserEntity user = new UserEntity();
        user.setLoginName(loginName);
        user.setFullName(userName);
        return userRepository.saveAndFlush(user);
    }
}

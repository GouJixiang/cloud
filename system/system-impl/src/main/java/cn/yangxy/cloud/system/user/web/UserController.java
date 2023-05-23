package cn.yangxy.cloud.system.user.web;

import cn.yangxy.cloud.system.user.UserApi;
import cn.yangxy.cloud.system.user.domain.UserEntity;
import cn.yangxy.cloud.system.user.repository.UserRepository;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.yangxy.commons.vo.RestResult;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController implements UserApi {

    @Resource
    private UserRepository userRepository;

    private final static Logger log = LoggerFactory.getLogger(UserController.class);

    @Override
    @RequestMapping("/printf")
    public RestResult<String> printf() {
        List<UserEntity> userList = userRepository.findAll();
        if (userList.isEmpty())
            return RestResult.err("没有找到用户数据");
        return RestResult.ok(userList.get(0).getFullName());
    }

    @ResponseBody
    @GetMapping("/save/{userName}/{loginName}")
    public RestResult<UserEntity> saveUser(@PathVariable String userName, @PathVariable String loginName) {
        log.info("前端传递参数为：" + userName);
        UserEntity user = new UserEntity();
        user.setLoginName(loginName);
        user.setFullName(userName);
        return RestResult.ok(userRepository.saveAndFlush(user));
    }
}

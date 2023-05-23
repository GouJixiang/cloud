package cn.yangxy.cloud.system.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.yangxy.commons.vo.RestResult;

public interface UserApi {

    @RequestMapping("/printf")
    public RestResult<String> printf();

}

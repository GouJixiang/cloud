package org.yangxy.commons.enums;

import org.springframework.context.MessageSource;

/**
 * <p>
 * 接口状态枚举
 * @author <a href="mailto:yangxianyin@mail.taiji.com.cn">yangxy</a>
 * @version 1.0, 2023/5/23
 */

public enum RestStatusEnums {

    OK(200, "操作成功"),
    UNAUTHORIZED(401, "抱歉，您请登录系统后访问!"),
    RATE_LIMIT(429, "访问已限流，请稍候再请求!"),
    INTERNAL_ERROR(1001, "操作失败，系统内部错误"),
    BUS_ERROR(1010, "业务异常"),
    FLOW_ERROR(1011, "流程异常"),
    FLOW_AUTH_ERROR(1012, "流程权限异常"),
    EXISTS(1020, "数据已存在错误"),
    NOT_FOUND(1021, "数据未找到错误"),
    PARAM_IS_INVALID(2001, "参数错误");

    private final int resultCode;
    private final String resultMsg;

    RestStatusEnums(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }
}

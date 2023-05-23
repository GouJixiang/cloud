package org.yangxy.commons.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.yangxy.commons.enums.RestStatusEnums;

/**
 * <p>
 *
 * @author <a href="mailto:yangxianyin@mail.taiji.com.cn">yangxy</a>
 * @version 1.0, 2023/5/23
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestResult<T> {

    private int code;
    private T data;
    private String message;
    private String status;

    public RestResult() {}

    public RestResult(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public RestResult(String status, RestStatusEnums restStatusEnums) {
        this.status = status;
        this.code = restStatusEnums.getResultCode();
        this.message = restStatusEnums.getResultMsg();
    }

    public static <T> RestResult<T> ok() {
        return new RestResult<>(RestStatusEnums.OK.getResultCode(), null, RestStatusEnums.OK.getResultMsg());
    }

    public static <T> RestResult<T> ok(T data) {
        return new RestResult<>(RestStatusEnums.OK.getResultCode(), data, RestStatusEnums.OK.getResultMsg());
    }


}

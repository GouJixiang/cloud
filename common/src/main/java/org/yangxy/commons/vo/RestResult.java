package org.yangxy.commons.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.yangxy.commons.enums.RestStatusEnums;

/**
 * <p>
 *
 * @author <a href="mailto:tiamoer@outlook.com">yangxy</a>
 * @version 1.0, 2023/5/23
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestResult<T> {

    private String message;
    private int code;
    private T data;
    private String status;

    public RestResult() {
    }

    public RestResult(String status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public RestResult(String status, RestStatusEnums RestStatusEnums) {
        this.status = status;
        this.code = RestStatusEnums.getResultCode();
        this.message = RestStatusEnums.getResultMsg();
    }

    public static <T> RestResult<T> ok() {
        return new RestResult("success", RestStatusEnums.OK);
    }

    public static <T> RestResult<T> ok(T data) {
        return (new RestResult("success", RestStatusEnums.OK)).data(data);
    }

    public static <T> RestResult<T> err() {
        return new RestResult("error", RestStatusEnums.INTERNAL_ERROR);
    }

    public static <T> RestResult<T> err(String msg) {
        return new RestResult("error", RestStatusEnums.BUS_ERROR.getResultCode(), msg);
    }

    public static <T> RestResult<T> flowErr(String msg, int errCode) {
        return new RestResult("error", errCode, msg);
    }

    public static <T> RestResult<T> flowAuthErr(String msg) {
        return new RestResult("error", RestStatusEnums.FLOW_AUTH_ERROR.getResultCode(), msg);
    }

    public static <T> RestResult<T> existsErr() {
        return new RestResult("error", RestStatusEnums.EXISTS);
    }

    public static <T> RestResult<T> notFoundErr() {
        return new RestResult("error", RestStatusEnums.NOT_FOUND);
    }

    public RestResult<T> data(T object) {
        this.data = object;
        return this;
    }

    public RestResult<T> msg(String message) {
        this.message = message;
        return this;
    }

    public RestResult<T> msg(String format, Object... messages) {
        this.message = String.format(format, messages);
        return this;
    }

    public RestResult<T> code(int code) {
        this.code = code;
        return this;
    }

    public int getCode() {
        return this.code;
    }

    public String getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public static class Status {
        public static final String SUCCESS = "success";
        public static final String ERROR = "error";

        private Status() {
        }
    }


}

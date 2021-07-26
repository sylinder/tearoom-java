package com.caps.tearoomjava.common;

import lombok.Data;

@Data
public class CommonResult<T> {

    private int code = 200;

    private String message;

    private T result;

    public CommonResult() {
    }

    private CommonResult(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static <T> CommonResult<T> success(T result) {
        return new CommonResult<>(200, null, result);
    }

    public static <T> CommonResult<T> fail(int code, String message) {
        return new CommonResult<>(code, message, null);
    }

    public static <T> CommonResult<T> fail(
            String message) {
        return new CommonResult<>(400, message, null);
    }

}

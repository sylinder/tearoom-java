package com.caps.tearoomjava.exception;

import com.caps.tearoomjava.common.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public CommonResult exceptionHandler(Exception e) {
        return CommonResult.fail(e.getMessage());
    }
}

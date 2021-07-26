package com.caps.tearoomjava.controller;

import com.caps.tearoomjava.common.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public CommonResult<String> test() {
        return CommonResult.success("drink tea first");
    }
}

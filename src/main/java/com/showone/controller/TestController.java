package com.showone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HHN
 * @Date 2020/7/20.
 * @Description TODO
 **/
@RestController
@Api(tags = "测试接口")
public class TestController {
    @GetMapping("/hello")
    @ApiOperation(value = "测试方法")
    public String hello(){
        return "hello world";
    }
}

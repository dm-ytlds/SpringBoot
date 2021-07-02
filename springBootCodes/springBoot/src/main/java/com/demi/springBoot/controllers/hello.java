package com.demi.springBoot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一个接口
 *  @RestController注解一定得有。是一个控件组件。
 */

@RestController
public class hello {
    // 映射请求 注解。
    @RequestMapping("/hello")
    public static String hello() {
        return "hello, world!";
    }
}

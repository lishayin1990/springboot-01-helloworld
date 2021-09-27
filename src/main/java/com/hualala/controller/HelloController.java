package com.hualala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: yinlisha
 * @Date: 2021-09-27 11:28 上午
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("调用了hello方法11");
        return "hello";
    }
}

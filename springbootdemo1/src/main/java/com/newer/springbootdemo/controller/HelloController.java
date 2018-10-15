package com.newer.springbootdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shining
 */
@RestController
//允许跨域访问
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

  //返回内容 再次添加
        return "hello world!";
    }
}

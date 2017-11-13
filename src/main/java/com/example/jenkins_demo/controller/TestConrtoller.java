package com.example.jenkins_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adam
 * @ClassName TestConrtoller
 * @Description
 * @create 2017/11/13/013 17:01
 */
@RestController
public class TestConrtoller {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}

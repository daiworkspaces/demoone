package com.newdemoone.demoone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Value("${test.hello}")
    private  String testHello;



    //@RequestMapping("/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }

    @GetMapping(value = "/hello2")
    public String hello2(){
        return "hello 2"+testHello;
    }
}

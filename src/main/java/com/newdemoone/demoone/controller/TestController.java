package com.newdemoone.demoone.controller;

import com.newdemoone.demoone.domain.User;
import com.newdemoone.demoone.server.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class TestController {

    @Resource
    private UserService useService;

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

    @GetMapping(value = "/test/user")
    public List<User> TestUse(){
        return useService.userList();
    }
}

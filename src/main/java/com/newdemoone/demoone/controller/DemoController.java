package com.newdemoone.demoone.controller;


import com.newdemoone.demoone.domain.Demo;
import com.newdemoone.demoone.server.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping(value = "hello/demo",method = RequestMethod.GET)
    public List<Demo> demos(){
        return demoService.list();
    }
}

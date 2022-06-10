package com.newdemoone.demoone.controller;

import com.newdemoone.demoone.domain.InfList;
import com.newdemoone.demoone.resp.CommonResp;
import com.newdemoone.demoone.server.InfListService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;


@RestController
public class InfListController {

    @Resource
    private InfListService infListService;

    @Value("${test.hello}")
    private  String testHello;




    @GetMapping(value = "/test/infList")
    public CommonResp infList() {
        CommonResp<List<InfList>> resp = new CommonResp<>();
       List<InfList> list = infListService.list();
        resp.setContent(list);
        return resp;
    }

}

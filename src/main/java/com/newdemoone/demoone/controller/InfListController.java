package com.newdemoone.demoone.controller;


import com.newdemoone.demoone.req.InfListReq;
import com.newdemoone.demoone.resp.CommonResp;
import com.newdemoone.demoone.resp.InfListResp;
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
    public CommonResp infList(InfListReq req) {
        CommonResp<List<InfListResp>> resp = new CommonResp<>();
       List<InfListResp> list = infListService.list(req);
        resp.setContent(list);
        return resp;
    }

}

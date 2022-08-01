package com.newdemoone.demoone.controller;


import com.newdemoone.demoone.req.InfListQueryReq;
import com.newdemoone.demoone.req.InfListSaveReq;
import com.newdemoone.demoone.resp.CommonResp;
import com.newdemoone.demoone.resp.InfListResp;
import com.newdemoone.demoone.resp.PageResp;
import com.newdemoone.demoone.server.InfListService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
public class InfListController {

    @Resource
    private InfListService infListService;

    @Value("${test.hello}")
    private  String testHello;




    @GetMapping(value = "/test/infList")
    public CommonResp infList(InfListQueryReq req) {
        CommonResp<PageResp<InfListResp>> resp = new CommonResp<>();
       PageResp<InfListResp> list = infListService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping (value = "/test/saveInfList")
    public CommonResp saveInfList(@RequestBody InfListSaveReq req) {
        CommonResp resp = new CommonResp<>();


        return resp;
    }

}

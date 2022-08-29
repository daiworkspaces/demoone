package com.newdemoone.demoone.controller;


import com.newdemoone.demoone.req.InfListQueryReq;
import com.newdemoone.demoone.req.InfListSaveReq;
import com.newdemoone.demoone.resp.CommonResp;
import com.newdemoone.demoone.resp.InfListResp;
import com.newdemoone.demoone.resp.PageResp;
import com.newdemoone.demoone.server.InfListService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@CrossOrigin
@RestController
public class InfListController {

    @Resource
    private InfListService infListService;

    @Value("${test.hello}")
    private  String testHello;




    @GetMapping(value = "/test/infList")
    public CommonResp infList(@Valid InfListQueryReq req) {
        CommonResp<PageResp<InfListResp>> resp = new CommonResp<>();
       PageResp<InfListResp> list = infListService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping (value = "/test/saveInfList")
    public CommonResp saveInfList(@Valid @RequestBody InfListSaveReq req) {
        CommonResp resp = new CommonResp<>();
        infListService.saveInfList(req);
        return resp;
    }

    @CrossOrigin(value = "http://localhost:8080/",allowedHeaders = "*")
    @DeleteMapping (value = "/test/delete/{id}")
    public CommonResp delete(@PathVariable Long id) {
        CommonResp resp = new CommonResp<>();
        infListService.delete(id);
        return resp;
    }

}

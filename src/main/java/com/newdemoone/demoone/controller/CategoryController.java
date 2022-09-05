package com.newdemoone.demoone.controller;


import com.newdemoone.demoone.req.CategoryQueryReq;
import com.newdemoone.demoone.req.CategorySaveReq;
import com.newdemoone.demoone.resp.CommonResp;
import com.newdemoone.demoone.resp.CategoryResp;
import com.newdemoone.demoone.resp.PageResp;
import com.newdemoone.demoone.server.CategoryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@CrossOrigin
@RestController
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @Value("${test.hello}")
    private  String testHello;




    @GetMapping(value = "/test/category")
    public CommonResp category(@Valid CategoryQueryReq req) {
        CommonResp<PageResp<CategoryResp>> resp = new CommonResp<>();
       PageResp<CategoryResp> list = categoryService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping (value = "/test/saveCategory")
    public CommonResp saveCategory(@Valid @RequestBody CategorySaveReq req) {
        CommonResp resp = new CommonResp<>();
        categoryService.saveCategory(req);
        return resp;
    }

    @CrossOrigin(value = "http://localhost:8080/",allowedHeaders = "*")
    @DeleteMapping (value = "/category/delete/{id}")
    public CommonResp delete(@PathVariable Long id) {
        CommonResp resp = new CommonResp<>();
        categoryService.delete(id);
        return resp;
    }

}

package com.newdemoone.demoone.req;

import com.newdemoone.demoone.resp.InfListResp;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class PageReq {
    @NotNull(message = "页面不能为空")
    private int page;
    @NotNull(message = "每页条数不能为空")
    @Max(value = 100,message = "查询页数不能超过100")
    private int size;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
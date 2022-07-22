package com.newdemoone.demoone.req;

import java.util.Date;

public class InfListReq extends PageReq{

    private String name;

    private String infName;

    private String infMode;

    private String infAddress;

    private Integer executionStatus;

    private String results;

    private String resultsDetails;

    private String infRemarks;

    private Date createTime;

    private Date updateTime;

    private String createUser;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfName() {
        return infName;
    }

    public void setInfName(String infName) {
        this.infName = infName;
    }

    public String getInfMode() {
        return infMode;
    }

    public void setInfMode(String infMode) {
        this.infMode = infMode;
    }

    public String getInfAddress() {
        return infAddress;
    }

    public void setInfAddress(String infAddress) {
        this.infAddress = infAddress;
    }

    public Integer getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(Integer executionStatus) {
        this.executionStatus = executionStatus;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getResultsDetails() {
        return resultsDetails;
    }

    public void setResultsDetails(String resultsDetails) {
        this.resultsDetails = resultsDetails;
    }

    public String getInfRemarks() {
        return infRemarks;
    }

    public void setInfRemarks(String infRemarks) {
        this.infRemarks = infRemarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }



}
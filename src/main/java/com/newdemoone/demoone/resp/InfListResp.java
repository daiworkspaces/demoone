package com.newdemoone.demoone.resp;

import java.util.Date;

public class InfListResp {


    private Long id;
    private String name;

    private String description;

    private String infName;

    private String infMode;

    private String infAddress;

    private Integer executionStatus;

    private String results;

    private String resultsDetails;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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



}
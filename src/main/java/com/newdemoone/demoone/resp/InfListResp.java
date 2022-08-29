package com.newdemoone.demoone.resp;

import javax.validation.constraints.NotNull;
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

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDocCount() {
        return docCount;
    }

    public void setDocCount(String docCount) {
        this.docCount = docCount;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    private String cover;

    private String docCount;

    private String viewCount;

    private String voteCount;


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
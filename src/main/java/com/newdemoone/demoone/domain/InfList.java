package com.newdemoone.demoone.domain;

public class InfList {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String infName;

    private String infMode;

    private String infAddress;

    private Integer executionStatus;

    private String results;

    private String resultsDetails;

    private String infRemarks;

    private String createTime;

    private String updateTime;

    private String createUser;

    private String category;

    private String cover;

    public void setDocCount(String docCount) {
        this.docCount = docCount;
    }

    private String docCount;

//    public String getDoccount() {
//        return doccount;
//    }

    //private String doccount;


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

    public Long getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    public Long getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
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

    public String getInfRemarks() {
        return infRemarks;
    }

    public void setInfRemarks(String infRemarks) {
        this.infRemarks = infRemarks;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

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

    public void setDoccount(String docCount) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", description=").append(description);
        sb.append(", infName=").append(infName);
        sb.append(", infMode=").append(infMode);
        sb.append(", infAddress=").append(infAddress);
        sb.append(", executionStatus=").append(executionStatus);
        sb.append(", results=").append(results);
        sb.append(", resultsDetails=").append(resultsDetails);
        sb.append(", infRemarks=").append(infRemarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", category=").append(category);
        sb.append(", cover=").append(cover);
        sb.append(", docCount=").append(docCount);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", voteCount=").append(voteCount);
        sb.append("]");
        return sb.toString();
    }
}
package com.newdemoone.demoone.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfListExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategory1IdIsNull() {
            addCriterion("category1_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory1IdIsNotNull() {
            addCriterion("category1_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1IdEqualTo(Long value) {
            addCriterion("category1_id =", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotEqualTo(Long value) {
            addCriterion("category1_id <>", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThan(Long value) {
            addCriterion("category1_id >", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("category1_id >=", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdLessThan(Long value) {
            addCriterion("category1_id <", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdLessThanOrEqualTo(Long value) {
            addCriterion("category1_id <=", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdIn(List<Long> values) {
            addCriterion("category1_id in", values, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotIn(List<Long> values) {
            addCriterion("category1_id not in", values, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdBetween(Long value1, Long value2) {
            addCriterion("category1_id between", value1, value2, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotBetween(Long value1, Long value2) {
            addCriterion("category1_id not between", value1, value2, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdIsNull() {
            addCriterion("category2_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory2IdIsNotNull() {
            addCriterion("category2_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2IdEqualTo(Long value) {
            addCriterion("category2_id =", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotEqualTo(Long value) {
            addCriterion("category2_id <>", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThan(Long value) {
            addCriterion("category2_id >", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThanOrEqualTo(Long value) {
            addCriterion("category2_id >=", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdLessThan(Long value) {
            addCriterion("category2_id <", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdLessThanOrEqualTo(Long value) {
            addCriterion("category2_id <=", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdIn(List<Long> values) {
            addCriterion("category2_id in", values, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotIn(List<Long> values) {
            addCriterion("category2_id not in", values, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdBetween(Long value1, Long value2) {
            addCriterion("category2_id between", value1, value2, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotBetween(Long value1, Long value2) {
            addCriterion("category2_id not between", value1, value2, "category2Id");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andInfNameIsNull() {
            addCriterion("inf_name is null");
            return (Criteria) this;
        }

        public Criteria andInfNameIsNotNull() {
            addCriterion("inf_name is not null");
            return (Criteria) this;
        }

        public Criteria andInfNameEqualTo(String value) {
            addCriterion("inf_name =", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameNotEqualTo(String value) {
            addCriterion("inf_name <>", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameGreaterThan(String value) {
            addCriterion("inf_name >", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameGreaterThanOrEqualTo(String value) {
            addCriterion("inf_name >=", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameLessThan(String value) {
            addCriterion("inf_name <", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameLessThanOrEqualTo(String value) {
            addCriterion("inf_name <=", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameLike(String value) {
            addCriterion("inf_name like", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameNotLike(String value) {
            addCriterion("inf_name not like", value, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameIn(List<String> values) {
            addCriterion("inf_name in", values, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameNotIn(List<String> values) {
            addCriterion("inf_name not in", values, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameBetween(String value1, String value2) {
            addCriterion("inf_name between", value1, value2, "infName");
            return (Criteria) this;
        }

        public Criteria andInfNameNotBetween(String value1, String value2) {
            addCriterion("inf_name not between", value1, value2, "infName");
            return (Criteria) this;
        }

        public Criteria andInfModeIsNull() {
            addCriterion("inf_mode is null");
            return (Criteria) this;
        }

        public Criteria andInfModeIsNotNull() {
            addCriterion("inf_mode is not null");
            return (Criteria) this;
        }

        public Criteria andInfModeEqualTo(String value) {
            addCriterion("inf_mode =", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeNotEqualTo(String value) {
            addCriterion("inf_mode <>", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeGreaterThan(String value) {
            addCriterion("inf_mode >", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeGreaterThanOrEqualTo(String value) {
            addCriterion("inf_mode >=", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeLessThan(String value) {
            addCriterion("inf_mode <", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeLessThanOrEqualTo(String value) {
            addCriterion("inf_mode <=", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeLike(String value) {
            addCriterion("inf_mode like", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeNotLike(String value) {
            addCriterion("inf_mode not like", value, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeIn(List<String> values) {
            addCriterion("inf_mode in", values, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeNotIn(List<String> values) {
            addCriterion("inf_mode not in", values, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeBetween(String value1, String value2) {
            addCriterion("inf_mode between", value1, value2, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfModeNotBetween(String value1, String value2) {
            addCriterion("inf_mode not between", value1, value2, "infMode");
            return (Criteria) this;
        }

        public Criteria andInfAddressIsNull() {
            addCriterion("inf_address is null");
            return (Criteria) this;
        }

        public Criteria andInfAddressIsNotNull() {
            addCriterion("inf_address is not null");
            return (Criteria) this;
        }

        public Criteria andInfAddressEqualTo(String value) {
            addCriterion("inf_address =", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressNotEqualTo(String value) {
            addCriterion("inf_address <>", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressGreaterThan(String value) {
            addCriterion("inf_address >", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressGreaterThanOrEqualTo(String value) {
            addCriterion("inf_address >=", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressLessThan(String value) {
            addCriterion("inf_address <", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressLessThanOrEqualTo(String value) {
            addCriterion("inf_address <=", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressLike(String value) {
            addCriterion("inf_address like", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressNotLike(String value) {
            addCriterion("inf_address not like", value, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressIn(List<String> values) {
            addCriterion("inf_address in", values, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressNotIn(List<String> values) {
            addCriterion("inf_address not in", values, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressBetween(String value1, String value2) {
            addCriterion("inf_address between", value1, value2, "infAddress");
            return (Criteria) this;
        }

        public Criteria andInfAddressNotBetween(String value1, String value2) {
            addCriterion("inf_address not between", value1, value2, "infAddress");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusIsNull() {
            addCriterion("Execution_status is null");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusIsNotNull() {
            addCriterion("Execution_status is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusEqualTo(Integer value) {
            addCriterion("Execution_status =", value, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusNotEqualTo(Integer value) {
            addCriterion("Execution_status <>", value, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusGreaterThan(Integer value) {
            addCriterion("Execution_status >", value, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Execution_status >=", value, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusLessThan(Integer value) {
            addCriterion("Execution_status <", value, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Execution_status <=", value, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusIn(List<Integer> values) {
            addCriterion("Execution_status in", values, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusNotIn(List<Integer> values) {
            addCriterion("Execution_status not in", values, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusBetween(Integer value1, Integer value2) {
            addCriterion("Execution_status between", value1, value2, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andExecutionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Execution_status not between", value1, value2, "executionStatus");
            return (Criteria) this;
        }

        public Criteria andResultsIsNull() {
            addCriterion("results is null");
            return (Criteria) this;
        }

        public Criteria andResultsIsNotNull() {
            addCriterion("results is not null");
            return (Criteria) this;
        }

        public Criteria andResultsEqualTo(String value) {
            addCriterion("results =", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotEqualTo(String value) {
            addCriterion("results <>", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsGreaterThan(String value) {
            addCriterion("results >", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsGreaterThanOrEqualTo(String value) {
            addCriterion("results >=", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsLessThan(String value) {
            addCriterion("results <", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsLessThanOrEqualTo(String value) {
            addCriterion("results <=", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsLike(String value) {
            addCriterion("results like", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotLike(String value) {
            addCriterion("results not like", value, "results");
            return (Criteria) this;
        }

        public Criteria andResultsIn(List<String> values) {
            addCriterion("results in", values, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotIn(List<String> values) {
            addCriterion("results not in", values, "results");
            return (Criteria) this;
        }

        public Criteria andResultsBetween(String value1, String value2) {
            addCriterion("results between", value1, value2, "results");
            return (Criteria) this;
        }

        public Criteria andResultsNotBetween(String value1, String value2) {
            addCriterion("results not between", value1, value2, "results");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsIsNull() {
            addCriterion("results_details is null");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsIsNotNull() {
            addCriterion("results_details is not null");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsEqualTo(String value) {
            addCriterion("results_details =", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsNotEqualTo(String value) {
            addCriterion("results_details <>", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsGreaterThan(String value) {
            addCriterion("results_details >", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("results_details >=", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsLessThan(String value) {
            addCriterion("results_details <", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsLessThanOrEqualTo(String value) {
            addCriterion("results_details <=", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsLike(String value) {
            addCriterion("results_details like", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsNotLike(String value) {
            addCriterion("results_details not like", value, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsIn(List<String> values) {
            addCriterion("results_details in", values, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsNotIn(List<String> values) {
            addCriterion("results_details not in", values, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsBetween(String value1, String value2) {
            addCriterion("results_details between", value1, value2, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andResultsDetailsNotBetween(String value1, String value2) {
            addCriterion("results_details not between", value1, value2, "resultsDetails");
            return (Criteria) this;
        }

        public Criteria andInfRemarksIsNull() {
            addCriterion("inf_remarks is null");
            return (Criteria) this;
        }

        public Criteria andInfRemarksIsNotNull() {
            addCriterion("inf_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andInfRemarksEqualTo(String value) {
            addCriterion("inf_remarks =", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksNotEqualTo(String value) {
            addCriterion("inf_remarks <>", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksGreaterThan(String value) {
            addCriterion("inf_remarks >", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("inf_remarks >=", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksLessThan(String value) {
            addCriterion("inf_remarks <", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksLessThanOrEqualTo(String value) {
            addCriterion("inf_remarks <=", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksLike(String value) {
            addCriterion("inf_remarks like", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksNotLike(String value) {
            addCriterion("inf_remarks not like", value, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksIn(List<String> values) {
            addCriterion("inf_remarks in", values, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksNotIn(List<String> values) {
            addCriterion("inf_remarks not in", values, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksBetween(String value1, String value2) {
            addCriterion("inf_remarks between", value1, value2, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andInfRemarksNotBetween(String value1, String value2) {
            addCriterion("inf_remarks not between", value1, value2, "infRemarks");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
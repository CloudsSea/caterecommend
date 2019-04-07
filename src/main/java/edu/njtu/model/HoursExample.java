package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class HoursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HoursExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andMondayOpenIsNull() {
            addCriterion("monday_open is null");
            return (Criteria) this;
        }

        public Criteria andMondayOpenIsNotNull() {
            addCriterion("monday_open is not null");
            return (Criteria) this;
        }

        public Criteria andMondayOpenEqualTo(String value) {
            addCriterion("monday_open =", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenNotEqualTo(String value) {
            addCriterion("monday_open <>", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenGreaterThan(String value) {
            addCriterion("monday_open >", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("monday_open >=", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenLessThan(String value) {
            addCriterion("monday_open <", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenLessThanOrEqualTo(String value) {
            addCriterion("monday_open <=", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenLike(String value) {
            addCriterion("monday_open like", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenNotLike(String value) {
            addCriterion("monday_open not like", value, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenIn(List<String> values) {
            addCriterion("monday_open in", values, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenNotIn(List<String> values) {
            addCriterion("monday_open not in", values, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenBetween(String value1, String value2) {
            addCriterion("monday_open between", value1, value2, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayOpenNotBetween(String value1, String value2) {
            addCriterion("monday_open not between", value1, value2, "mondayOpen");
            return (Criteria) this;
        }

        public Criteria andMondayCloseIsNull() {
            addCriterion("monday_close is null");
            return (Criteria) this;
        }

        public Criteria andMondayCloseIsNotNull() {
            addCriterion("monday_close is not null");
            return (Criteria) this;
        }

        public Criteria andMondayCloseEqualTo(String value) {
            addCriterion("monday_close =", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseNotEqualTo(String value) {
            addCriterion("monday_close <>", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseGreaterThan(String value) {
            addCriterion("monday_close >", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("monday_close >=", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseLessThan(String value) {
            addCriterion("monday_close <", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseLessThanOrEqualTo(String value) {
            addCriterion("monday_close <=", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseLike(String value) {
            addCriterion("monday_close like", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseNotLike(String value) {
            addCriterion("monday_close not like", value, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseIn(List<String> values) {
            addCriterion("monday_close in", values, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseNotIn(List<String> values) {
            addCriterion("monday_close not in", values, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseBetween(String value1, String value2) {
            addCriterion("monday_close between", value1, value2, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andMondayCloseNotBetween(String value1, String value2) {
            addCriterion("monday_close not between", value1, value2, "mondayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenIsNull() {
            addCriterion("thursday_open is null");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenIsNotNull() {
            addCriterion("thursday_open is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenEqualTo(String value) {
            addCriterion("thursday_open =", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenNotEqualTo(String value) {
            addCriterion("thursday_open <>", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenGreaterThan(String value) {
            addCriterion("thursday_open >", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("thursday_open >=", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenLessThan(String value) {
            addCriterion("thursday_open <", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenLessThanOrEqualTo(String value) {
            addCriterion("thursday_open <=", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenLike(String value) {
            addCriterion("thursday_open like", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenNotLike(String value) {
            addCriterion("thursday_open not like", value, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenIn(List<String> values) {
            addCriterion("thursday_open in", values, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenNotIn(List<String> values) {
            addCriterion("thursday_open not in", values, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenBetween(String value1, String value2) {
            addCriterion("thursday_open between", value1, value2, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayOpenNotBetween(String value1, String value2) {
            addCriterion("thursday_open not between", value1, value2, "thursdayOpen");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseIsNull() {
            addCriterion("thursday_close is null");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseIsNotNull() {
            addCriterion("thursday_close is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseEqualTo(String value) {
            addCriterion("thursday_close =", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseNotEqualTo(String value) {
            addCriterion("thursday_close <>", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseGreaterThan(String value) {
            addCriterion("thursday_close >", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("thursday_close >=", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseLessThan(String value) {
            addCriterion("thursday_close <", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseLessThanOrEqualTo(String value) {
            addCriterion("thursday_close <=", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseLike(String value) {
            addCriterion("thursday_close like", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseNotLike(String value) {
            addCriterion("thursday_close not like", value, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseIn(List<String> values) {
            addCriterion("thursday_close in", values, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseNotIn(List<String> values) {
            addCriterion("thursday_close not in", values, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseBetween(String value1, String value2) {
            addCriterion("thursday_close between", value1, value2, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andThursdayCloseNotBetween(String value1, String value2) {
            addCriterion("thursday_close not between", value1, value2, "thursdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenIsNull() {
            addCriterion("wednesday_open is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenIsNotNull() {
            addCriterion("wednesday_open is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenEqualTo(String value) {
            addCriterion("wednesday_open =", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenNotEqualTo(String value) {
            addCriterion("wednesday_open <>", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenGreaterThan(String value) {
            addCriterion("wednesday_open >", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("wednesday_open >=", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenLessThan(String value) {
            addCriterion("wednesday_open <", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenLessThanOrEqualTo(String value) {
            addCriterion("wednesday_open <=", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenLike(String value) {
            addCriterion("wednesday_open like", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenNotLike(String value) {
            addCriterion("wednesday_open not like", value, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenIn(List<String> values) {
            addCriterion("wednesday_open in", values, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenNotIn(List<String> values) {
            addCriterion("wednesday_open not in", values, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenBetween(String value1, String value2) {
            addCriterion("wednesday_open between", value1, value2, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayOpenNotBetween(String value1, String value2) {
            addCriterion("wednesday_open not between", value1, value2, "wednesdayOpen");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseIsNull() {
            addCriterion("wednesday_close is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseIsNotNull() {
            addCriterion("wednesday_close is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseEqualTo(String value) {
            addCriterion("wednesday_close =", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseNotEqualTo(String value) {
            addCriterion("wednesday_close <>", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseGreaterThan(String value) {
            addCriterion("wednesday_close >", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("wednesday_close >=", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseLessThan(String value) {
            addCriterion("wednesday_close <", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseLessThanOrEqualTo(String value) {
            addCriterion("wednesday_close <=", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseLike(String value) {
            addCriterion("wednesday_close like", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseNotLike(String value) {
            addCriterion("wednesday_close not like", value, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseIn(List<String> values) {
            addCriterion("wednesday_close in", values, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseNotIn(List<String> values) {
            addCriterion("wednesday_close not in", values, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseBetween(String value1, String value2) {
            addCriterion("wednesday_close between", value1, value2, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andWednesdayCloseNotBetween(String value1, String value2) {
            addCriterion("wednesday_close not between", value1, value2, "wednesdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenIsNull() {
            addCriterion("saturday_open is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenIsNotNull() {
            addCriterion("saturday_open is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenEqualTo(String value) {
            addCriterion("saturday_open =", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenNotEqualTo(String value) {
            addCriterion("saturday_open <>", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenGreaterThan(String value) {
            addCriterion("saturday_open >", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("saturday_open >=", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenLessThan(String value) {
            addCriterion("saturday_open <", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenLessThanOrEqualTo(String value) {
            addCriterion("saturday_open <=", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenLike(String value) {
            addCriterion("saturday_open like", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenNotLike(String value) {
            addCriterion("saturday_open not like", value, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenIn(List<String> values) {
            addCriterion("saturday_open in", values, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenNotIn(List<String> values) {
            addCriterion("saturday_open not in", values, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenBetween(String value1, String value2) {
            addCriterion("saturday_open between", value1, value2, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayOpenNotBetween(String value1, String value2) {
            addCriterion("saturday_open not between", value1, value2, "saturdayOpen");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseIsNull() {
            addCriterion("saturday_close is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseIsNotNull() {
            addCriterion("saturday_close is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseEqualTo(String value) {
            addCriterion("saturday_close =", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseNotEqualTo(String value) {
            addCriterion("saturday_close <>", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseGreaterThan(String value) {
            addCriterion("saturday_close >", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("saturday_close >=", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseLessThan(String value) {
            addCriterion("saturday_close <", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseLessThanOrEqualTo(String value) {
            addCriterion("saturday_close <=", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseLike(String value) {
            addCriterion("saturday_close like", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseNotLike(String value) {
            addCriterion("saturday_close not like", value, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseIn(List<String> values) {
            addCriterion("saturday_close in", values, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseNotIn(List<String> values) {
            addCriterion("saturday_close not in", values, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseBetween(String value1, String value2) {
            addCriterion("saturday_close between", value1, value2, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andSaturdayCloseNotBetween(String value1, String value2) {
            addCriterion("saturday_close not between", value1, value2, "saturdayClose");
            return (Criteria) this;
        }

        public Criteria andFridayOpenIsNull() {
            addCriterion("friday_open is null");
            return (Criteria) this;
        }

        public Criteria andFridayOpenIsNotNull() {
            addCriterion("friday_open is not null");
            return (Criteria) this;
        }

        public Criteria andFridayOpenEqualTo(String value) {
            addCriterion("friday_open =", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenNotEqualTo(String value) {
            addCriterion("friday_open <>", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenGreaterThan(String value) {
            addCriterion("friday_open >", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("friday_open >=", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenLessThan(String value) {
            addCriterion("friday_open <", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenLessThanOrEqualTo(String value) {
            addCriterion("friday_open <=", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenLike(String value) {
            addCriterion("friday_open like", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenNotLike(String value) {
            addCriterion("friday_open not like", value, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenIn(List<String> values) {
            addCriterion("friday_open in", values, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenNotIn(List<String> values) {
            addCriterion("friday_open not in", values, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenBetween(String value1, String value2) {
            addCriterion("friday_open between", value1, value2, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayOpenNotBetween(String value1, String value2) {
            addCriterion("friday_open not between", value1, value2, "fridayOpen");
            return (Criteria) this;
        }

        public Criteria andFridayCloseIsNull() {
            addCriterion("friday_close is null");
            return (Criteria) this;
        }

        public Criteria andFridayCloseIsNotNull() {
            addCriterion("friday_close is not null");
            return (Criteria) this;
        }

        public Criteria andFridayCloseEqualTo(String value) {
            addCriterion("friday_close =", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseNotEqualTo(String value) {
            addCriterion("friday_close <>", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseGreaterThan(String value) {
            addCriterion("friday_close >", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("friday_close >=", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseLessThan(String value) {
            addCriterion("friday_close <", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseLessThanOrEqualTo(String value) {
            addCriterion("friday_close <=", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseLike(String value) {
            addCriterion("friday_close like", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseNotLike(String value) {
            addCriterion("friday_close not like", value, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseIn(List<String> values) {
            addCriterion("friday_close in", values, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseNotIn(List<String> values) {
            addCriterion("friday_close not in", values, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseBetween(String value1, String value2) {
            addCriterion("friday_close between", value1, value2, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andFridayCloseNotBetween(String value1, String value2) {
            addCriterion("friday_close not between", value1, value2, "fridayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenIsNull() {
            addCriterion("tuesday_open is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenIsNotNull() {
            addCriterion("tuesday_open is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenEqualTo(String value) {
            addCriterion("tuesday_open =", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenNotEqualTo(String value) {
            addCriterion("tuesday_open <>", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenGreaterThan(String value) {
            addCriterion("tuesday_open >", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("tuesday_open >=", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenLessThan(String value) {
            addCriterion("tuesday_open <", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenLessThanOrEqualTo(String value) {
            addCriterion("tuesday_open <=", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenLike(String value) {
            addCriterion("tuesday_open like", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenNotLike(String value) {
            addCriterion("tuesday_open not like", value, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenIn(List<String> values) {
            addCriterion("tuesday_open in", values, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenNotIn(List<String> values) {
            addCriterion("tuesday_open not in", values, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenBetween(String value1, String value2) {
            addCriterion("tuesday_open between", value1, value2, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayOpenNotBetween(String value1, String value2) {
            addCriterion("tuesday_open not between", value1, value2, "tuesdayOpen");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseIsNull() {
            addCriterion("tuesday_close is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseIsNotNull() {
            addCriterion("tuesday_close is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseEqualTo(String value) {
            addCriterion("tuesday_close =", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseNotEqualTo(String value) {
            addCriterion("tuesday_close <>", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseGreaterThan(String value) {
            addCriterion("tuesday_close >", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("tuesday_close >=", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseLessThan(String value) {
            addCriterion("tuesday_close <", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseLessThanOrEqualTo(String value) {
            addCriterion("tuesday_close <=", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseLike(String value) {
            addCriterion("tuesday_close like", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseNotLike(String value) {
            addCriterion("tuesday_close not like", value, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseIn(List<String> values) {
            addCriterion("tuesday_close in", values, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseNotIn(List<String> values) {
            addCriterion("tuesday_close not in", values, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseBetween(String value1, String value2) {
            addCriterion("tuesday_close between", value1, value2, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andTuesdayCloseNotBetween(String value1, String value2) {
            addCriterion("tuesday_close not between", value1, value2, "tuesdayClose");
            return (Criteria) this;
        }

        public Criteria andSundayOpenIsNull() {
            addCriterion("sunday_open is null");
            return (Criteria) this;
        }

        public Criteria andSundayOpenIsNotNull() {
            addCriterion("sunday_open is not null");
            return (Criteria) this;
        }

        public Criteria andSundayOpenEqualTo(String value) {
            addCriterion("sunday_open =", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenNotEqualTo(String value) {
            addCriterion("sunday_open <>", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenGreaterThan(String value) {
            addCriterion("sunday_open >", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenGreaterThanOrEqualTo(String value) {
            addCriterion("sunday_open >=", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenLessThan(String value) {
            addCriterion("sunday_open <", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenLessThanOrEqualTo(String value) {
            addCriterion("sunday_open <=", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenLike(String value) {
            addCriterion("sunday_open like", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenNotLike(String value) {
            addCriterion("sunday_open not like", value, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenIn(List<String> values) {
            addCriterion("sunday_open in", values, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenNotIn(List<String> values) {
            addCriterion("sunday_open not in", values, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenBetween(String value1, String value2) {
            addCriterion("sunday_open between", value1, value2, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayOpenNotBetween(String value1, String value2) {
            addCriterion("sunday_open not between", value1, value2, "sundayOpen");
            return (Criteria) this;
        }

        public Criteria andSundayCloseIsNull() {
            addCriterion("sunday_close is null");
            return (Criteria) this;
        }

        public Criteria andSundayCloseIsNotNull() {
            addCriterion("sunday_close is not null");
            return (Criteria) this;
        }

        public Criteria andSundayCloseEqualTo(String value) {
            addCriterion("sunday_close =", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseNotEqualTo(String value) {
            addCriterion("sunday_close <>", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseGreaterThan(String value) {
            addCriterion("sunday_close >", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("sunday_close >=", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseLessThan(String value) {
            addCriterion("sunday_close <", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseLessThanOrEqualTo(String value) {
            addCriterion("sunday_close <=", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseLike(String value) {
            addCriterion("sunday_close like", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseNotLike(String value) {
            addCriterion("sunday_close not like", value, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseIn(List<String> values) {
            addCriterion("sunday_close in", values, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseNotIn(List<String> values) {
            addCriterion("sunday_close not in", values, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseBetween(String value1, String value2) {
            addCriterion("sunday_close between", value1, value2, "sundayClose");
            return (Criteria) this;
        }

        public Criteria andSundayCloseNotBetween(String value1, String value2) {
            addCriterion("sunday_close not between", value1, value2, "sundayClose");
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
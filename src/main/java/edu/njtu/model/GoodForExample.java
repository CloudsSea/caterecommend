package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class GoodForExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodForExample() {
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

        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEqualTo(Boolean value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotEqualTo(Boolean value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThan(Boolean value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThanOrEqualTo(Boolean value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThan(Boolean value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThanOrEqualTo(Boolean value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastIn(List<Boolean> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotIn(List<Boolean> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastBetween(Boolean value1, Boolean value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotBetween(Boolean value1, Boolean value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBrunchIsNull() {
            addCriterion("brunch is null");
            return (Criteria) this;
        }

        public Criteria andBrunchIsNotNull() {
            addCriterion("brunch is not null");
            return (Criteria) this;
        }

        public Criteria andBrunchEqualTo(Boolean value) {
            addCriterion("brunch =", value, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchNotEqualTo(Boolean value) {
            addCriterion("brunch <>", value, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchGreaterThan(Boolean value) {
            addCriterion("brunch >", value, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("brunch >=", value, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchLessThan(Boolean value) {
            addCriterion("brunch <", value, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchLessThanOrEqualTo(Boolean value) {
            addCriterion("brunch <=", value, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchIn(List<Boolean> values) {
            addCriterion("brunch in", values, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchNotIn(List<Boolean> values) {
            addCriterion("brunch not in", values, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchBetween(Boolean value1, Boolean value2) {
            addCriterion("brunch between", value1, value2, "brunch");
            return (Criteria) this;
        }

        public Criteria andBrunchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("brunch not between", value1, value2, "brunch");
            return (Criteria) this;
        }

        public Criteria andDessertIsNull() {
            addCriterion("dessert is null");
            return (Criteria) this;
        }

        public Criteria andDessertIsNotNull() {
            addCriterion("dessert is not null");
            return (Criteria) this;
        }

        public Criteria andDessertEqualTo(Boolean value) {
            addCriterion("dessert =", value, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertNotEqualTo(Boolean value) {
            addCriterion("dessert <>", value, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertGreaterThan(Boolean value) {
            addCriterion("dessert >", value, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dessert >=", value, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertLessThan(Boolean value) {
            addCriterion("dessert <", value, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertLessThanOrEqualTo(Boolean value) {
            addCriterion("dessert <=", value, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertIn(List<Boolean> values) {
            addCriterion("dessert in", values, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertNotIn(List<Boolean> values) {
            addCriterion("dessert not in", values, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertBetween(Boolean value1, Boolean value2) {
            addCriterion("dessert between", value1, value2, "dessert");
            return (Criteria) this;
        }

        public Criteria andDessertNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dessert not between", value1, value2, "dessert");
            return (Criteria) this;
        }

        public Criteria andDinnerIsNull() {
            addCriterion("dinner is null");
            return (Criteria) this;
        }

        public Criteria andDinnerIsNotNull() {
            addCriterion("dinner is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerEqualTo(Boolean value) {
            addCriterion("dinner =", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotEqualTo(Boolean value) {
            addCriterion("dinner <>", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerGreaterThan(Boolean value) {
            addCriterion("dinner >", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dinner >=", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLessThan(Boolean value) {
            addCriterion("dinner <", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLessThanOrEqualTo(Boolean value) {
            addCriterion("dinner <=", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerIn(List<Boolean> values) {
            addCriterion("dinner in", values, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotIn(List<Boolean> values) {
            addCriterion("dinner not in", values, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerBetween(Boolean value1, Boolean value2) {
            addCriterion("dinner between", value1, value2, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dinner not between", value1, value2, "dinner");
            return (Criteria) this;
        }

        public Criteria andLatenightIsNull() {
            addCriterion("latenight is null");
            return (Criteria) this;
        }

        public Criteria andLatenightIsNotNull() {
            addCriterion("latenight is not null");
            return (Criteria) this;
        }

        public Criteria andLatenightEqualTo(Boolean value) {
            addCriterion("latenight =", value, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightNotEqualTo(Boolean value) {
            addCriterion("latenight <>", value, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightGreaterThan(Boolean value) {
            addCriterion("latenight >", value, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightGreaterThanOrEqualTo(Boolean value) {
            addCriterion("latenight >=", value, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightLessThan(Boolean value) {
            addCriterion("latenight <", value, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightLessThanOrEqualTo(Boolean value) {
            addCriterion("latenight <=", value, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightIn(List<Boolean> values) {
            addCriterion("latenight in", values, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightNotIn(List<Boolean> values) {
            addCriterion("latenight not in", values, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightBetween(Boolean value1, Boolean value2) {
            addCriterion("latenight between", value1, value2, "latenight");
            return (Criteria) this;
        }

        public Criteria andLatenightNotBetween(Boolean value1, Boolean value2) {
            addCriterion("latenight not between", value1, value2, "latenight");
            return (Criteria) this;
        }

        public Criteria andLunchIsNull() {
            addCriterion("lunch is null");
            return (Criteria) this;
        }

        public Criteria andLunchIsNotNull() {
            addCriterion("lunch is not null");
            return (Criteria) this;
        }

        public Criteria andLunchEqualTo(Boolean value) {
            addCriterion("lunch =", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotEqualTo(Boolean value) {
            addCriterion("lunch <>", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchGreaterThan(Boolean value) {
            addCriterion("lunch >", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lunch >=", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLessThan(Boolean value) {
            addCriterion("lunch <", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLessThanOrEqualTo(Boolean value) {
            addCriterion("lunch <=", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchIn(List<Boolean> values) {
            addCriterion("lunch in", values, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotIn(List<Boolean> values) {
            addCriterion("lunch not in", values, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchBetween(Boolean value1, Boolean value2) {
            addCriterion("lunch between", value1, value2, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lunch not between", value1, value2, "lunch");
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
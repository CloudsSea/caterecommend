package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkingExample() {
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

        public Criteria andGarageIsNull() {
            addCriterion("garage is null");
            return (Criteria) this;
        }

        public Criteria andGarageIsNotNull() {
            addCriterion("garage is not null");
            return (Criteria) this;
        }

        public Criteria andGarageEqualTo(Boolean value) {
            addCriterion("garage =", value, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageNotEqualTo(Boolean value) {
            addCriterion("garage <>", value, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageGreaterThan(Boolean value) {
            addCriterion("garage >", value, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("garage >=", value, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageLessThan(Boolean value) {
            addCriterion("garage <", value, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageLessThanOrEqualTo(Boolean value) {
            addCriterion("garage <=", value, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageIn(List<Boolean> values) {
            addCriterion("garage in", values, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageNotIn(List<Boolean> values) {
            addCriterion("garage not in", values, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageBetween(Boolean value1, Boolean value2) {
            addCriterion("garage between", value1, value2, "garage");
            return (Criteria) this;
        }

        public Criteria andGarageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("garage not between", value1, value2, "garage");
            return (Criteria) this;
        }

        public Criteria andLotIsNull() {
            addCriterion("lot is null");
            return (Criteria) this;
        }

        public Criteria andLotIsNotNull() {
            addCriterion("lot is not null");
            return (Criteria) this;
        }

        public Criteria andLotEqualTo(Boolean value) {
            addCriterion("lot =", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotEqualTo(Boolean value) {
            addCriterion("lot <>", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThan(Boolean value) {
            addCriterion("lot >", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lot >=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThan(Boolean value) {
            addCriterion("lot <", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThanOrEqualTo(Boolean value) {
            addCriterion("lot <=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotIn(List<Boolean> values) {
            addCriterion("lot in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotIn(List<Boolean> values) {
            addCriterion("lot not in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotBetween(Boolean value1, Boolean value2) {
            addCriterion("lot between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lot not between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(Boolean value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(Boolean value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(Boolean value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(Boolean value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(Boolean value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<Boolean> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<Boolean> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(Boolean value1, Boolean value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andValetIsNull() {
            addCriterion("valet is null");
            return (Criteria) this;
        }

        public Criteria andValetIsNotNull() {
            addCriterion("valet is not null");
            return (Criteria) this;
        }

        public Criteria andValetEqualTo(Boolean value) {
            addCriterion("valet =", value, "valet");
            return (Criteria) this;
        }

        public Criteria andValetNotEqualTo(Boolean value) {
            addCriterion("valet <>", value, "valet");
            return (Criteria) this;
        }

        public Criteria andValetGreaterThan(Boolean value) {
            addCriterion("valet >", value, "valet");
            return (Criteria) this;
        }

        public Criteria andValetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("valet >=", value, "valet");
            return (Criteria) this;
        }

        public Criteria andValetLessThan(Boolean value) {
            addCriterion("valet <", value, "valet");
            return (Criteria) this;
        }

        public Criteria andValetLessThanOrEqualTo(Boolean value) {
            addCriterion("valet <=", value, "valet");
            return (Criteria) this;
        }

        public Criteria andValetIn(List<Boolean> values) {
            addCriterion("valet in", values, "valet");
            return (Criteria) this;
        }

        public Criteria andValetNotIn(List<Boolean> values) {
            addCriterion("valet not in", values, "valet");
            return (Criteria) this;
        }

        public Criteria andValetBetween(Boolean value1, Boolean value2) {
            addCriterion("valet between", value1, value2, "valet");
            return (Criteria) this;
        }

        public Criteria andValetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("valet not between", value1, value2, "valet");
            return (Criteria) this;
        }

        public Criteria andValidatedIsNull() {
            addCriterion("validated is null");
            return (Criteria) this;
        }

        public Criteria andValidatedIsNotNull() {
            addCriterion("validated is not null");
            return (Criteria) this;
        }

        public Criteria andValidatedEqualTo(Boolean value) {
            addCriterion("validated =", value, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedNotEqualTo(Boolean value) {
            addCriterion("validated <>", value, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedGreaterThan(Boolean value) {
            addCriterion("validated >", value, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validated >=", value, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedLessThan(Boolean value) {
            addCriterion("validated <", value, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedLessThanOrEqualTo(Boolean value) {
            addCriterion("validated <=", value, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedIn(List<Boolean> values) {
            addCriterion("validated in", values, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedNotIn(List<Boolean> values) {
            addCriterion("validated not in", values, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedBetween(Boolean value1, Boolean value2) {
            addCriterion("validated between", value1, value2, "validated");
            return (Criteria) this;
        }

        public Criteria andValidatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validated not between", value1, value2, "validated");
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
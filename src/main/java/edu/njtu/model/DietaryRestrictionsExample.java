package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class DietaryRestrictionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DietaryRestrictionsExample() {
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

        public Criteria andDairyFreeIsNull() {
            addCriterion("dairy_free is null");
            return (Criteria) this;
        }

        public Criteria andDairyFreeIsNotNull() {
            addCriterion("dairy_free is not null");
            return (Criteria) this;
        }

        public Criteria andDairyFreeEqualTo(Boolean value) {
            addCriterion("dairy_free =", value, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeNotEqualTo(Boolean value) {
            addCriterion("dairy_free <>", value, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeGreaterThan(Boolean value) {
            addCriterion("dairy_free >", value, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dairy_free >=", value, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeLessThan(Boolean value) {
            addCriterion("dairy_free <", value, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("dairy_free <=", value, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeIn(List<Boolean> values) {
            addCriterion("dairy_free in", values, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeNotIn(List<Boolean> values) {
            addCriterion("dairy_free not in", values, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("dairy_free between", value1, value2, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andDairyFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dairy_free not between", value1, value2, "dairyFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeIsNull() {
            addCriterion("gluten_free is null");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeIsNotNull() {
            addCriterion("gluten_free is not null");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeEqualTo(Boolean value) {
            addCriterion("gluten_free =", value, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeNotEqualTo(Boolean value) {
            addCriterion("gluten_free <>", value, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeGreaterThan(Boolean value) {
            addCriterion("gluten_free >", value, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gluten_free >=", value, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeLessThan(Boolean value) {
            addCriterion("gluten_free <", value, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("gluten_free <=", value, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeIn(List<Boolean> values) {
            addCriterion("gluten_free in", values, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeNotIn(List<Boolean> values) {
            addCriterion("gluten_free not in", values, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("gluten_free between", value1, value2, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andGlutenFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gluten_free not between", value1, value2, "glutenFree");
            return (Criteria) this;
        }

        public Criteria andHalalIsNull() {
            addCriterion("halal is null");
            return (Criteria) this;
        }

        public Criteria andHalalIsNotNull() {
            addCriterion("halal is not null");
            return (Criteria) this;
        }

        public Criteria andHalalEqualTo(Boolean value) {
            addCriterion("halal =", value, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalNotEqualTo(Boolean value) {
            addCriterion("halal <>", value, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalGreaterThan(Boolean value) {
            addCriterion("halal >", value, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("halal >=", value, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalLessThan(Boolean value) {
            addCriterion("halal <", value, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalLessThanOrEqualTo(Boolean value) {
            addCriterion("halal <=", value, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalIn(List<Boolean> values) {
            addCriterion("halal in", values, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalNotIn(List<Boolean> values) {
            addCriterion("halal not in", values, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalBetween(Boolean value1, Boolean value2) {
            addCriterion("halal between", value1, value2, "halal");
            return (Criteria) this;
        }

        public Criteria andHalalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("halal not between", value1, value2, "halal");
            return (Criteria) this;
        }

        public Criteria andKosherIsNull() {
            addCriterion("kosher is null");
            return (Criteria) this;
        }

        public Criteria andKosherIsNotNull() {
            addCriterion("kosher is not null");
            return (Criteria) this;
        }

        public Criteria andKosherEqualTo(Boolean value) {
            addCriterion("kosher =", value, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherNotEqualTo(Boolean value) {
            addCriterion("kosher <>", value, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherGreaterThan(Boolean value) {
            addCriterion("kosher >", value, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherGreaterThanOrEqualTo(Boolean value) {
            addCriterion("kosher >=", value, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherLessThan(Boolean value) {
            addCriterion("kosher <", value, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherLessThanOrEqualTo(Boolean value) {
            addCriterion("kosher <=", value, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherIn(List<Boolean> values) {
            addCriterion("kosher in", values, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherNotIn(List<Boolean> values) {
            addCriterion("kosher not in", values, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherBetween(Boolean value1, Boolean value2) {
            addCriterion("kosher between", value1, value2, "kosher");
            return (Criteria) this;
        }

        public Criteria andKosherNotBetween(Boolean value1, Boolean value2) {
            addCriterion("kosher not between", value1, value2, "kosher");
            return (Criteria) this;
        }

        public Criteria andSoyFreeIsNull() {
            addCriterion("soy_free is null");
            return (Criteria) this;
        }

        public Criteria andSoyFreeIsNotNull() {
            addCriterion("soy_free is not null");
            return (Criteria) this;
        }

        public Criteria andSoyFreeEqualTo(Boolean value) {
            addCriterion("soy_free =", value, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeNotEqualTo(Boolean value) {
            addCriterion("soy_free <>", value, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeGreaterThan(Boolean value) {
            addCriterion("soy_free >", value, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("soy_free >=", value, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeLessThan(Boolean value) {
            addCriterion("soy_free <", value, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("soy_free <=", value, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeIn(List<Boolean> values) {
            addCriterion("soy_free in", values, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeNotIn(List<Boolean> values) {
            addCriterion("soy_free not in", values, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("soy_free between", value1, value2, "soyFree");
            return (Criteria) this;
        }

        public Criteria andSoyFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("soy_free not between", value1, value2, "soyFree");
            return (Criteria) this;
        }

        public Criteria andVeganIsNull() {
            addCriterion("vegan is null");
            return (Criteria) this;
        }

        public Criteria andVeganIsNotNull() {
            addCriterion("vegan is not null");
            return (Criteria) this;
        }

        public Criteria andVeganEqualTo(Boolean value) {
            addCriterion("vegan =", value, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganNotEqualTo(Boolean value) {
            addCriterion("vegan <>", value, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganGreaterThan(Boolean value) {
            addCriterion("vegan >", value, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganGreaterThanOrEqualTo(Boolean value) {
            addCriterion("vegan >=", value, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganLessThan(Boolean value) {
            addCriterion("vegan <", value, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganLessThanOrEqualTo(Boolean value) {
            addCriterion("vegan <=", value, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganIn(List<Boolean> values) {
            addCriterion("vegan in", values, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganNotIn(List<Boolean> values) {
            addCriterion("vegan not in", values, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganBetween(Boolean value1, Boolean value2) {
            addCriterion("vegan between", value1, value2, "vegan");
            return (Criteria) this;
        }

        public Criteria andVeganNotBetween(Boolean value1, Boolean value2) {
            addCriterion("vegan not between", value1, value2, "vegan");
            return (Criteria) this;
        }

        public Criteria andVegetarianIsNull() {
            addCriterion("vegetarian is null");
            return (Criteria) this;
        }

        public Criteria andVegetarianIsNotNull() {
            addCriterion("vegetarian is not null");
            return (Criteria) this;
        }

        public Criteria andVegetarianEqualTo(Boolean value) {
            addCriterion("vegetarian =", value, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianNotEqualTo(Boolean value) {
            addCriterion("vegetarian <>", value, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianGreaterThan(Boolean value) {
            addCriterion("vegetarian >", value, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianGreaterThanOrEqualTo(Boolean value) {
            addCriterion("vegetarian >=", value, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianLessThan(Boolean value) {
            addCriterion("vegetarian <", value, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianLessThanOrEqualTo(Boolean value) {
            addCriterion("vegetarian <=", value, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianIn(List<Boolean> values) {
            addCriterion("vegetarian in", values, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianNotIn(List<Boolean> values) {
            addCriterion("vegetarian not in", values, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianBetween(Boolean value1, Boolean value2) {
            addCriterion("vegetarian between", value1, value2, "vegetarian");
            return (Criteria) this;
        }

        public Criteria andVegetarianNotBetween(Boolean value1, Boolean value2) {
            addCriterion("vegetarian not between", value1, value2, "vegetarian");
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
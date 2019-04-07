package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class AmbienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmbienceExample() {
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

        public Criteria andCasualIsNull() {
            addCriterion("casual is null");
            return (Criteria) this;
        }

        public Criteria andCasualIsNotNull() {
            addCriterion("casual is not null");
            return (Criteria) this;
        }

        public Criteria andCasualEqualTo(Boolean value) {
            addCriterion("casual =", value, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualNotEqualTo(Boolean value) {
            addCriterion("casual <>", value, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualGreaterThan(Boolean value) {
            addCriterion("casual >", value, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualGreaterThanOrEqualTo(Boolean value) {
            addCriterion("casual >=", value, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualLessThan(Boolean value) {
            addCriterion("casual <", value, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualLessThanOrEqualTo(Boolean value) {
            addCriterion("casual <=", value, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualIn(List<Boolean> values) {
            addCriterion("casual in", values, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualNotIn(List<Boolean> values) {
            addCriterion("casual not in", values, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualBetween(Boolean value1, Boolean value2) {
            addCriterion("casual between", value1, value2, "casual");
            return (Criteria) this;
        }

        public Criteria andCasualNotBetween(Boolean value1, Boolean value2) {
            addCriterion("casual not between", value1, value2, "casual");
            return (Criteria) this;
        }

        public Criteria andClassyIsNull() {
            addCriterion("classy is null");
            return (Criteria) this;
        }

        public Criteria andClassyIsNotNull() {
            addCriterion("classy is not null");
            return (Criteria) this;
        }

        public Criteria andClassyEqualTo(Boolean value) {
            addCriterion("classy =", value, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyNotEqualTo(Boolean value) {
            addCriterion("classy <>", value, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyGreaterThan(Boolean value) {
            addCriterion("classy >", value, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("classy >=", value, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyLessThan(Boolean value) {
            addCriterion("classy <", value, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyLessThanOrEqualTo(Boolean value) {
            addCriterion("classy <=", value, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyIn(List<Boolean> values) {
            addCriterion("classy in", values, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyNotIn(List<Boolean> values) {
            addCriterion("classy not in", values, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyBetween(Boolean value1, Boolean value2) {
            addCriterion("classy between", value1, value2, "classy");
            return (Criteria) this;
        }

        public Criteria andClassyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("classy not between", value1, value2, "classy");
            return (Criteria) this;
        }

        public Criteria andDiveyIsNull() {
            addCriterion("divey is null");
            return (Criteria) this;
        }

        public Criteria andDiveyIsNotNull() {
            addCriterion("divey is not null");
            return (Criteria) this;
        }

        public Criteria andDiveyEqualTo(Boolean value) {
            addCriterion("divey =", value, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyNotEqualTo(Boolean value) {
            addCriterion("divey <>", value, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyGreaterThan(Boolean value) {
            addCriterion("divey >", value, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("divey >=", value, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyLessThan(Boolean value) {
            addCriterion("divey <", value, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyLessThanOrEqualTo(Boolean value) {
            addCriterion("divey <=", value, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyIn(List<Boolean> values) {
            addCriterion("divey in", values, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyNotIn(List<Boolean> values) {
            addCriterion("divey not in", values, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyBetween(Boolean value1, Boolean value2) {
            addCriterion("divey between", value1, value2, "divey");
            return (Criteria) this;
        }

        public Criteria andDiveyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("divey not between", value1, value2, "divey");
            return (Criteria) this;
        }

        public Criteria andHipsterIsNull() {
            addCriterion("hipster is null");
            return (Criteria) this;
        }

        public Criteria andHipsterIsNotNull() {
            addCriterion("hipster is not null");
            return (Criteria) this;
        }

        public Criteria andHipsterEqualTo(Boolean value) {
            addCriterion("hipster =", value, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterNotEqualTo(Boolean value) {
            addCriterion("hipster <>", value, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterGreaterThan(Boolean value) {
            addCriterion("hipster >", value, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hipster >=", value, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterLessThan(Boolean value) {
            addCriterion("hipster <", value, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterLessThanOrEqualTo(Boolean value) {
            addCriterion("hipster <=", value, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterIn(List<Boolean> values) {
            addCriterion("hipster in", values, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterNotIn(List<Boolean> values) {
            addCriterion("hipster not in", values, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterBetween(Boolean value1, Boolean value2) {
            addCriterion("hipster between", value1, value2, "hipster");
            return (Criteria) this;
        }

        public Criteria andHipsterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hipster not between", value1, value2, "hipster");
            return (Criteria) this;
        }

        public Criteria andIntimateIsNull() {
            addCriterion("intimate is null");
            return (Criteria) this;
        }

        public Criteria andIntimateIsNotNull() {
            addCriterion("intimate is not null");
            return (Criteria) this;
        }

        public Criteria andIntimateEqualTo(Boolean value) {
            addCriterion("intimate =", value, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateNotEqualTo(Boolean value) {
            addCriterion("intimate <>", value, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateGreaterThan(Boolean value) {
            addCriterion("intimate >", value, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("intimate >=", value, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateLessThan(Boolean value) {
            addCriterion("intimate <", value, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateLessThanOrEqualTo(Boolean value) {
            addCriterion("intimate <=", value, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateIn(List<Boolean> values) {
            addCriterion("intimate in", values, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateNotIn(List<Boolean> values) {
            addCriterion("intimate not in", values, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateBetween(Boolean value1, Boolean value2) {
            addCriterion("intimate between", value1, value2, "intimate");
            return (Criteria) this;
        }

        public Criteria andIntimateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("intimate not between", value1, value2, "intimate");
            return (Criteria) this;
        }

        public Criteria andRomanticIsNull() {
            addCriterion("romantic is null");
            return (Criteria) this;
        }

        public Criteria andRomanticIsNotNull() {
            addCriterion("romantic is not null");
            return (Criteria) this;
        }

        public Criteria andRomanticEqualTo(Boolean value) {
            addCriterion("romantic =", value, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticNotEqualTo(Boolean value) {
            addCriterion("romantic <>", value, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticGreaterThan(Boolean value) {
            addCriterion("romantic >", value, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticGreaterThanOrEqualTo(Boolean value) {
            addCriterion("romantic >=", value, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticLessThan(Boolean value) {
            addCriterion("romantic <", value, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticLessThanOrEqualTo(Boolean value) {
            addCriterion("romantic <=", value, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticIn(List<Boolean> values) {
            addCriterion("romantic in", values, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticNotIn(List<Boolean> values) {
            addCriterion("romantic not in", values, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticBetween(Boolean value1, Boolean value2) {
            addCriterion("romantic between", value1, value2, "romantic");
            return (Criteria) this;
        }

        public Criteria andRomanticNotBetween(Boolean value1, Boolean value2) {
            addCriterion("romantic not between", value1, value2, "romantic");
            return (Criteria) this;
        }

        public Criteria andTouristyIsNull() {
            addCriterion("touristy is null");
            return (Criteria) this;
        }

        public Criteria andTouristyIsNotNull() {
            addCriterion("touristy is not null");
            return (Criteria) this;
        }

        public Criteria andTouristyEqualTo(Boolean value) {
            addCriterion("touristy =", value, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyNotEqualTo(Boolean value) {
            addCriterion("touristy <>", value, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyGreaterThan(Boolean value) {
            addCriterion("touristy >", value, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("touristy >=", value, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyLessThan(Boolean value) {
            addCriterion("touristy <", value, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyLessThanOrEqualTo(Boolean value) {
            addCriterion("touristy <=", value, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyIn(List<Boolean> values) {
            addCriterion("touristy in", values, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyNotIn(List<Boolean> values) {
            addCriterion("touristy not in", values, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyBetween(Boolean value1, Boolean value2) {
            addCriterion("touristy between", value1, value2, "touristy");
            return (Criteria) this;
        }

        public Criteria andTouristyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("touristy not between", value1, value2, "touristy");
            return (Criteria) this;
        }

        public Criteria andTrendyIsNull() {
            addCriterion("trendy is null");
            return (Criteria) this;
        }

        public Criteria andTrendyIsNotNull() {
            addCriterion("trendy is not null");
            return (Criteria) this;
        }

        public Criteria andTrendyEqualTo(Boolean value) {
            addCriterion("trendy =", value, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyNotEqualTo(Boolean value) {
            addCriterion("trendy <>", value, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyGreaterThan(Boolean value) {
            addCriterion("trendy >", value, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trendy >=", value, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyLessThan(Boolean value) {
            addCriterion("trendy <", value, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyLessThanOrEqualTo(Boolean value) {
            addCriterion("trendy <=", value, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyIn(List<Boolean> values) {
            addCriterion("trendy in", values, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyNotIn(List<Boolean> values) {
            addCriterion("trendy not in", values, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyBetween(Boolean value1, Boolean value2) {
            addCriterion("trendy between", value1, value2, "trendy");
            return (Criteria) this;
        }

        public Criteria andTrendyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trendy not between", value1, value2, "trendy");
            return (Criteria) this;
        }

        public Criteria andUpscaleIsNull() {
            addCriterion("upscale is null");
            return (Criteria) this;
        }

        public Criteria andUpscaleIsNotNull() {
            addCriterion("upscale is not null");
            return (Criteria) this;
        }

        public Criteria andUpscaleEqualTo(Boolean value) {
            addCriterion("upscale =", value, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleNotEqualTo(Boolean value) {
            addCriterion("upscale <>", value, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleGreaterThan(Boolean value) {
            addCriterion("upscale >", value, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("upscale >=", value, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleLessThan(Boolean value) {
            addCriterion("upscale <", value, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleLessThanOrEqualTo(Boolean value) {
            addCriterion("upscale <=", value, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleIn(List<Boolean> values) {
            addCriterion("upscale in", values, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleNotIn(List<Boolean> values) {
            addCriterion("upscale not in", values, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleBetween(Boolean value1, Boolean value2) {
            addCriterion("upscale between", value1, value2, "upscale");
            return (Criteria) this;
        }

        public Criteria andUpscaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("upscale not between", value1, value2, "upscale");
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
package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class HairTypesSpecializedInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HairTypesSpecializedInExample() {
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

        public Criteria andAfricanamericanIsNull() {
            addCriterion("africanamerican is null");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanIsNotNull() {
            addCriterion("africanamerican is not null");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanEqualTo(Boolean value) {
            addCriterion("africanamerican =", value, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanNotEqualTo(Boolean value) {
            addCriterion("africanamerican <>", value, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanGreaterThan(Boolean value) {
            addCriterion("africanamerican >", value, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("africanamerican >=", value, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanLessThan(Boolean value) {
            addCriterion("africanamerican <", value, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanLessThanOrEqualTo(Boolean value) {
            addCriterion("africanamerican <=", value, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanIn(List<Boolean> values) {
            addCriterion("africanamerican in", values, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanNotIn(List<Boolean> values) {
            addCriterion("africanamerican not in", values, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanBetween(Boolean value1, Boolean value2) {
            addCriterion("africanamerican between", value1, value2, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAfricanamericanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("africanamerican not between", value1, value2, "africanamerican");
            return (Criteria) this;
        }

        public Criteria andAsianIsNull() {
            addCriterion("asian is null");
            return (Criteria) this;
        }

        public Criteria andAsianIsNotNull() {
            addCriterion("asian is not null");
            return (Criteria) this;
        }

        public Criteria andAsianEqualTo(Boolean value) {
            addCriterion("asian =", value, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianNotEqualTo(Boolean value) {
            addCriterion("asian <>", value, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianGreaterThan(Boolean value) {
            addCriterion("asian >", value, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianGreaterThanOrEqualTo(Boolean value) {
            addCriterion("asian >=", value, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianLessThan(Boolean value) {
            addCriterion("asian <", value, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianLessThanOrEqualTo(Boolean value) {
            addCriterion("asian <=", value, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianIn(List<Boolean> values) {
            addCriterion("asian in", values, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianNotIn(List<Boolean> values) {
            addCriterion("asian not in", values, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianBetween(Boolean value1, Boolean value2) {
            addCriterion("asian between", value1, value2, "asian");
            return (Criteria) this;
        }

        public Criteria andAsianNotBetween(Boolean value1, Boolean value2) {
            addCriterion("asian not between", value1, value2, "asian");
            return (Criteria) this;
        }

        public Criteria andColoringIsNull() {
            addCriterion("coloring is null");
            return (Criteria) this;
        }

        public Criteria andColoringIsNotNull() {
            addCriterion("coloring is not null");
            return (Criteria) this;
        }

        public Criteria andColoringEqualTo(Boolean value) {
            addCriterion("coloring =", value, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringNotEqualTo(Boolean value) {
            addCriterion("coloring <>", value, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringGreaterThan(Boolean value) {
            addCriterion("coloring >", value, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringGreaterThanOrEqualTo(Boolean value) {
            addCriterion("coloring >=", value, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringLessThan(Boolean value) {
            addCriterion("coloring <", value, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringLessThanOrEqualTo(Boolean value) {
            addCriterion("coloring <=", value, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringIn(List<Boolean> values) {
            addCriterion("coloring in", values, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringNotIn(List<Boolean> values) {
            addCriterion("coloring not in", values, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringBetween(Boolean value1, Boolean value2) {
            addCriterion("coloring between", value1, value2, "coloring");
            return (Criteria) this;
        }

        public Criteria andColoringNotBetween(Boolean value1, Boolean value2) {
            addCriterion("coloring not between", value1, value2, "coloring");
            return (Criteria) this;
        }

        public Criteria andCurlyIsNull() {
            addCriterion("curly is null");
            return (Criteria) this;
        }

        public Criteria andCurlyIsNotNull() {
            addCriterion("curly is not null");
            return (Criteria) this;
        }

        public Criteria andCurlyEqualTo(Boolean value) {
            addCriterion("curly =", value, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyNotEqualTo(Boolean value) {
            addCriterion("curly <>", value, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyGreaterThan(Boolean value) {
            addCriterion("curly >", value, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("curly >=", value, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyLessThan(Boolean value) {
            addCriterion("curly <", value, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyLessThanOrEqualTo(Boolean value) {
            addCriterion("curly <=", value, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyIn(List<Boolean> values) {
            addCriterion("curly in", values, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyNotIn(List<Boolean> values) {
            addCriterion("curly not in", values, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyBetween(Boolean value1, Boolean value2) {
            addCriterion("curly between", value1, value2, "curly");
            return (Criteria) this;
        }

        public Criteria andCurlyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("curly not between", value1, value2, "curly");
            return (Criteria) this;
        }

        public Criteria andExtensionsIsNull() {
            addCriterion("extensions is null");
            return (Criteria) this;
        }

        public Criteria andExtensionsIsNotNull() {
            addCriterion("extensions is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionsEqualTo(Boolean value) {
            addCriterion("extensions =", value, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsNotEqualTo(Boolean value) {
            addCriterion("extensions <>", value, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsGreaterThan(Boolean value) {
            addCriterion("extensions >", value, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("extensions >=", value, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsLessThan(Boolean value) {
            addCriterion("extensions <", value, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsLessThanOrEqualTo(Boolean value) {
            addCriterion("extensions <=", value, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsIn(List<Boolean> values) {
            addCriterion("extensions in", values, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsNotIn(List<Boolean> values) {
            addCriterion("extensions not in", values, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsBetween(Boolean value1, Boolean value2) {
            addCriterion("extensions between", value1, value2, "extensions");
            return (Criteria) this;
        }

        public Criteria andExtensionsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("extensions not between", value1, value2, "extensions");
            return (Criteria) this;
        }

        public Criteria andKidsIsNull() {
            addCriterion("kids is null");
            return (Criteria) this;
        }

        public Criteria andKidsIsNotNull() {
            addCriterion("kids is not null");
            return (Criteria) this;
        }

        public Criteria andKidsEqualTo(Boolean value) {
            addCriterion("kids =", value, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsNotEqualTo(Boolean value) {
            addCriterion("kids <>", value, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsGreaterThan(Boolean value) {
            addCriterion("kids >", value, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("kids >=", value, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsLessThan(Boolean value) {
            addCriterion("kids <", value, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsLessThanOrEqualTo(Boolean value) {
            addCriterion("kids <=", value, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsIn(List<Boolean> values) {
            addCriterion("kids in", values, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsNotIn(List<Boolean> values) {
            addCriterion("kids not in", values, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsBetween(Boolean value1, Boolean value2) {
            addCriterion("kids between", value1, value2, "kids");
            return (Criteria) this;
        }

        public Criteria andKidsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("kids not between", value1, value2, "kids");
            return (Criteria) this;
        }

        public Criteria andPermsIsNull() {
            addCriterion("perms is null");
            return (Criteria) this;
        }

        public Criteria andPermsIsNotNull() {
            addCriterion("perms is not null");
            return (Criteria) this;
        }

        public Criteria andPermsEqualTo(Boolean value) {
            addCriterion("perms =", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotEqualTo(Boolean value) {
            addCriterion("perms <>", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsGreaterThan(Boolean value) {
            addCriterion("perms >", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("perms >=", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLessThan(Boolean value) {
            addCriterion("perms <", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLessThanOrEqualTo(Boolean value) {
            addCriterion("perms <=", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsIn(List<Boolean> values) {
            addCriterion("perms in", values, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotIn(List<Boolean> values) {
            addCriterion("perms not in", values, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsBetween(Boolean value1, Boolean value2) {
            addCriterion("perms between", value1, value2, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("perms not between", value1, value2, "perms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsIsNull() {
            addCriterion("straightperms is null");
            return (Criteria) this;
        }

        public Criteria andStraightpermsIsNotNull() {
            addCriterion("straightperms is not null");
            return (Criteria) this;
        }

        public Criteria andStraightpermsEqualTo(Boolean value) {
            addCriterion("straightperms =", value, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsNotEqualTo(Boolean value) {
            addCriterion("straightperms <>", value, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsGreaterThan(Boolean value) {
            addCriterion("straightperms >", value, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("straightperms >=", value, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsLessThan(Boolean value) {
            addCriterion("straightperms <", value, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsLessThanOrEqualTo(Boolean value) {
            addCriterion("straightperms <=", value, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsIn(List<Boolean> values) {
            addCriterion("straightperms in", values, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsNotIn(List<Boolean> values) {
            addCriterion("straightperms not in", values, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsBetween(Boolean value1, Boolean value2) {
            addCriterion("straightperms between", value1, value2, "straightperms");
            return (Criteria) this;
        }

        public Criteria andStraightpermsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("straightperms not between", value1, value2, "straightperms");
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
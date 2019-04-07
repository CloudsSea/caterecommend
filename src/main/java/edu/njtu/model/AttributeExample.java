package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class AttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeExample() {
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

        public Criteria andAcceptsCreditCardsIsNull() {
            addCriterion("accepts_credit_cards is null");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsIsNotNull() {
            addCriterion("accepts_credit_cards is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsEqualTo(Boolean value) {
            addCriterion("accepts_credit_cards =", value, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsNotEqualTo(Boolean value) {
            addCriterion("accepts_credit_cards <>", value, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsGreaterThan(Boolean value) {
            addCriterion("accepts_credit_cards >", value, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accepts_credit_cards >=", value, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsLessThan(Boolean value) {
            addCriterion("accepts_credit_cards <", value, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsLessThanOrEqualTo(Boolean value) {
            addCriterion("accepts_credit_cards <=", value, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsIn(List<Boolean> values) {
            addCriterion("accepts_credit_cards in", values, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsNotIn(List<Boolean> values) {
            addCriterion("accepts_credit_cards not in", values, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsBetween(Boolean value1, Boolean value2) {
            addCriterion("accepts_credit_cards between", value1, value2, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsCreditCardsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accepts_credit_cards not between", value1, value2, "acceptsCreditCards");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceIsNull() {
            addCriterion("accepts_insurance is null");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceIsNotNull() {
            addCriterion("accepts_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceEqualTo(Boolean value) {
            addCriterion("accepts_insurance =", value, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceNotEqualTo(Boolean value) {
            addCriterion("accepts_insurance <>", value, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceGreaterThan(Boolean value) {
            addCriterion("accepts_insurance >", value, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accepts_insurance >=", value, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceLessThan(Boolean value) {
            addCriterion("accepts_insurance <", value, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceLessThanOrEqualTo(Boolean value) {
            addCriterion("accepts_insurance <=", value, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceIn(List<Boolean> values) {
            addCriterion("accepts_insurance in", values, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceNotIn(List<Boolean> values) {
            addCriterion("accepts_insurance not in", values, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceBetween(Boolean value1, Boolean value2) {
            addCriterion("accepts_insurance between", value1, value2, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAcceptsInsuranceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accepts_insurance not between", value1, value2, "acceptsInsurance");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedIsNull() {
            addCriterion("ages_allowed is null");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedIsNotNull() {
            addCriterion("ages_allowed is not null");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedEqualTo(String value) {
            addCriterion("ages_allowed =", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedNotEqualTo(String value) {
            addCriterion("ages_allowed <>", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedGreaterThan(String value) {
            addCriterion("ages_allowed >", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedGreaterThanOrEqualTo(String value) {
            addCriterion("ages_allowed >=", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedLessThan(String value) {
            addCriterion("ages_allowed <", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedLessThanOrEqualTo(String value) {
            addCriterion("ages_allowed <=", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedLike(String value) {
            addCriterion("ages_allowed like", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedNotLike(String value) {
            addCriterion("ages_allowed not like", value, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedIn(List<String> values) {
            addCriterion("ages_allowed in", values, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedNotIn(List<String> values) {
            addCriterion("ages_allowed not in", values, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedBetween(String value1, String value2) {
            addCriterion("ages_allowed between", value1, value2, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAgesAllowedNotBetween(String value1, String value2) {
            addCriterion("ages_allowed not between", value1, value2, "agesAllowed");
            return (Criteria) this;
        }

        public Criteria andAlcoholIsNull() {
            addCriterion("alcohol is null");
            return (Criteria) this;
        }

        public Criteria andAlcoholIsNotNull() {
            addCriterion("alcohol is not null");
            return (Criteria) this;
        }

        public Criteria andAlcoholEqualTo(String value) {
            addCriterion("alcohol =", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotEqualTo(String value) {
            addCriterion("alcohol <>", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholGreaterThan(String value) {
            addCriterion("alcohol >", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholGreaterThanOrEqualTo(String value) {
            addCriterion("alcohol >=", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholLessThan(String value) {
            addCriterion("alcohol <", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholLessThanOrEqualTo(String value) {
            addCriterion("alcohol <=", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholLike(String value) {
            addCriterion("alcohol like", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotLike(String value) {
            addCriterion("alcohol not like", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholIn(List<String> values) {
            addCriterion("alcohol in", values, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotIn(List<String> values) {
            addCriterion("alcohol not in", values, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholBetween(String value1, String value2) {
            addCriterion("alcohol between", value1, value2, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotBetween(String value1, String value2) {
            addCriterion("alcohol not between", value1, value2, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAttireIsNull() {
            addCriterion("attire is null");
            return (Criteria) this;
        }

        public Criteria andAttireIsNotNull() {
            addCriterion("attire is not null");
            return (Criteria) this;
        }

        public Criteria andAttireEqualTo(String value) {
            addCriterion("attire =", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireNotEqualTo(String value) {
            addCriterion("attire <>", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireGreaterThan(String value) {
            addCriterion("attire >", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireGreaterThanOrEqualTo(String value) {
            addCriterion("attire >=", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireLessThan(String value) {
            addCriterion("attire <", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireLessThanOrEqualTo(String value) {
            addCriterion("attire <=", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireLike(String value) {
            addCriterion("attire like", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireNotLike(String value) {
            addCriterion("attire not like", value, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireIn(List<String> values) {
            addCriterion("attire in", values, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireNotIn(List<String> values) {
            addCriterion("attire not in", values, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireBetween(String value1, String value2) {
            addCriterion("attire between", value1, value2, "attire");
            return (Criteria) this;
        }

        public Criteria andAttireNotBetween(String value1, String value2) {
            addCriterion("attire not between", value1, value2, "attire");
            return (Criteria) this;
        }

        public Criteria andByobIsNull() {
            addCriterion("byob is null");
            return (Criteria) this;
        }

        public Criteria andByobIsNotNull() {
            addCriterion("byob is not null");
            return (Criteria) this;
        }

        public Criteria andByobEqualTo(Boolean value) {
            addCriterion("byob =", value, "byob");
            return (Criteria) this;
        }

        public Criteria andByobNotEqualTo(Boolean value) {
            addCriterion("byob <>", value, "byob");
            return (Criteria) this;
        }

        public Criteria andByobGreaterThan(Boolean value) {
            addCriterion("byob >", value, "byob");
            return (Criteria) this;
        }

        public Criteria andByobGreaterThanOrEqualTo(Boolean value) {
            addCriterion("byob >=", value, "byob");
            return (Criteria) this;
        }

        public Criteria andByobLessThan(Boolean value) {
            addCriterion("byob <", value, "byob");
            return (Criteria) this;
        }

        public Criteria andByobLessThanOrEqualTo(Boolean value) {
            addCriterion("byob <=", value, "byob");
            return (Criteria) this;
        }

        public Criteria andByobIn(List<Boolean> values) {
            addCriterion("byob in", values, "byob");
            return (Criteria) this;
        }

        public Criteria andByobNotIn(List<Boolean> values) {
            addCriterion("byob not in", values, "byob");
            return (Criteria) this;
        }

        public Criteria andByobBetween(Boolean value1, Boolean value2) {
            addCriterion("byob between", value1, value2, "byob");
            return (Criteria) this;
        }

        public Criteria andByobNotBetween(Boolean value1, Boolean value2) {
            addCriterion("byob not between", value1, value2, "byob");
            return (Criteria) this;
        }

        public Criteria andByobCorkageIsNull() {
            addCriterion("byob_corkage is null");
            return (Criteria) this;
        }

        public Criteria andByobCorkageIsNotNull() {
            addCriterion("byob_corkage is not null");
            return (Criteria) this;
        }

        public Criteria andByobCorkageEqualTo(String value) {
            addCriterion("byob_corkage =", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageNotEqualTo(String value) {
            addCriterion("byob_corkage <>", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageGreaterThan(String value) {
            addCriterion("byob_corkage >", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageGreaterThanOrEqualTo(String value) {
            addCriterion("byob_corkage >=", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageLessThan(String value) {
            addCriterion("byob_corkage <", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageLessThanOrEqualTo(String value) {
            addCriterion("byob_corkage <=", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageLike(String value) {
            addCriterion("byob_corkage like", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageNotLike(String value) {
            addCriterion("byob_corkage not like", value, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageIn(List<String> values) {
            addCriterion("byob_corkage in", values, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageNotIn(List<String> values) {
            addCriterion("byob_corkage not in", values, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageBetween(String value1, String value2) {
            addCriterion("byob_corkage between", value1, value2, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByobCorkageNotBetween(String value1, String value2) {
            addCriterion("byob_corkage not between", value1, value2, "byobCorkage");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyIsNull() {
            addCriterion("by_appointment_only is null");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyIsNotNull() {
            addCriterion("by_appointment_only is not null");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyEqualTo(Boolean value) {
            addCriterion("by_appointment_only =", value, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyNotEqualTo(Boolean value) {
            addCriterion("by_appointment_only <>", value, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyGreaterThan(Boolean value) {
            addCriterion("by_appointment_only >", value, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("by_appointment_only >=", value, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyLessThan(Boolean value) {
            addCriterion("by_appointment_only <", value, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyLessThanOrEqualTo(Boolean value) {
            addCriterion("by_appointment_only <=", value, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyIn(List<Boolean> values) {
            addCriterion("by_appointment_only in", values, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyNotIn(List<Boolean> values) {
            addCriterion("by_appointment_only not in", values, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyBetween(Boolean value1, Boolean value2) {
            addCriterion("by_appointment_only between", value1, value2, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andByAppointmentOnlyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("by_appointment_only not between", value1, value2, "byAppointmentOnly");
            return (Criteria) this;
        }

        public Criteria andCatersIsNull() {
            addCriterion("caters is null");
            return (Criteria) this;
        }

        public Criteria andCatersIsNotNull() {
            addCriterion("caters is not null");
            return (Criteria) this;
        }

        public Criteria andCatersEqualTo(Boolean value) {
            addCriterion("caters =", value, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersNotEqualTo(Boolean value) {
            addCriterion("caters <>", value, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersGreaterThan(Boolean value) {
            addCriterion("caters >", value, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersGreaterThanOrEqualTo(Boolean value) {
            addCriterion("caters >=", value, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersLessThan(Boolean value) {
            addCriterion("caters <", value, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersLessThanOrEqualTo(Boolean value) {
            addCriterion("caters <=", value, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersIn(List<Boolean> values) {
            addCriterion("caters in", values, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersNotIn(List<Boolean> values) {
            addCriterion("caters not in", values, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersBetween(Boolean value1, Boolean value2) {
            addCriterion("caters between", value1, value2, "caters");
            return (Criteria) this;
        }

        public Criteria andCatersNotBetween(Boolean value1, Boolean value2) {
            addCriterion("caters not between", value1, value2, "caters");
            return (Criteria) this;
        }

        public Criteria andCoatCheckIsNull() {
            addCriterion("coat_check is null");
            return (Criteria) this;
        }

        public Criteria andCoatCheckIsNotNull() {
            addCriterion("coat_check is not null");
            return (Criteria) this;
        }

        public Criteria andCoatCheckEqualTo(Boolean value) {
            addCriterion("coat_check =", value, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckNotEqualTo(Boolean value) {
            addCriterion("coat_check <>", value, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckGreaterThan(Boolean value) {
            addCriterion("coat_check >", value, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("coat_check >=", value, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckLessThan(Boolean value) {
            addCriterion("coat_check <", value, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("coat_check <=", value, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckIn(List<Boolean> values) {
            addCriterion("coat_check in", values, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckNotIn(List<Boolean> values) {
            addCriterion("coat_check not in", values, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("coat_check between", value1, value2, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCoatCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("coat_check not between", value1, value2, "coatCheck");
            return (Criteria) this;
        }

        public Criteria andCorkageIsNull() {
            addCriterion("corkage is null");
            return (Criteria) this;
        }

        public Criteria andCorkageIsNotNull() {
            addCriterion("corkage is not null");
            return (Criteria) this;
        }

        public Criteria andCorkageEqualTo(Boolean value) {
            addCriterion("corkage =", value, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageNotEqualTo(Boolean value) {
            addCriterion("corkage <>", value, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageGreaterThan(Boolean value) {
            addCriterion("corkage >", value, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("corkage >=", value, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageLessThan(Boolean value) {
            addCriterion("corkage <", value, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageLessThanOrEqualTo(Boolean value) {
            addCriterion("corkage <=", value, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageIn(List<Boolean> values) {
            addCriterion("corkage in", values, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageNotIn(List<Boolean> values) {
            addCriterion("corkage not in", values, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageBetween(Boolean value1, Boolean value2) {
            addCriterion("corkage between", value1, value2, "corkage");
            return (Criteria) this;
        }

        public Criteria andCorkageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("corkage not between", value1, value2, "corkage");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNull() {
            addCriterion("delivery is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNotNull() {
            addCriterion("delivery is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEqualTo(Boolean value) {
            addCriterion("delivery =", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotEqualTo(Boolean value) {
            addCriterion("delivery <>", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThan(Boolean value) {
            addCriterion("delivery >", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delivery >=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThan(Boolean value) {
            addCriterion("delivery <", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThanOrEqualTo(Boolean value) {
            addCriterion("delivery <=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryIn(List<Boolean> values) {
            addCriterion("delivery in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotIn(List<Boolean> values) {
            addCriterion("delivery not in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryBetween(Boolean value1, Boolean value2) {
            addCriterion("delivery between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delivery not between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedIsNull() {
            addCriterion("dogs_allowed is null");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedIsNotNull() {
            addCriterion("dogs_allowed is not null");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedEqualTo(Boolean value) {
            addCriterion("dogs_allowed =", value, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedNotEqualTo(Boolean value) {
            addCriterion("dogs_allowed <>", value, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedGreaterThan(Boolean value) {
            addCriterion("dogs_allowed >", value, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dogs_allowed >=", value, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedLessThan(Boolean value) {
            addCriterion("dogs_allowed <", value, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedLessThanOrEqualTo(Boolean value) {
            addCriterion("dogs_allowed <=", value, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedIn(List<Boolean> values) {
            addCriterion("dogs_allowed in", values, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedNotIn(List<Boolean> values) {
            addCriterion("dogs_allowed not in", values, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedBetween(Boolean value1, Boolean value2) {
            addCriterion("dogs_allowed between", value1, value2, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDogsAllowedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dogs_allowed not between", value1, value2, "dogsAllowed");
            return (Criteria) this;
        }

        public Criteria andDriveThruIsNull() {
            addCriterion("drive_thru is null");
            return (Criteria) this;
        }

        public Criteria andDriveThruIsNotNull() {
            addCriterion("drive_thru is not null");
            return (Criteria) this;
        }

        public Criteria andDriveThruEqualTo(Boolean value) {
            addCriterion("drive_thru =", value, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruNotEqualTo(Boolean value) {
            addCriterion("drive_thru <>", value, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruGreaterThan(Boolean value) {
            addCriterion("drive_thru >", value, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruGreaterThanOrEqualTo(Boolean value) {
            addCriterion("drive_thru >=", value, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruLessThan(Boolean value) {
            addCriterion("drive_thru <", value, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruLessThanOrEqualTo(Boolean value) {
            addCriterion("drive_thru <=", value, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruIn(List<Boolean> values) {
            addCriterion("drive_thru in", values, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruNotIn(List<Boolean> values) {
            addCriterion("drive_thru not in", values, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruBetween(Boolean value1, Boolean value2) {
            addCriterion("drive_thru between", value1, value2, "driveThru");
            return (Criteria) this;
        }

        public Criteria andDriveThruNotBetween(Boolean value1, Boolean value2) {
            addCriterion("drive_thru not between", value1, value2, "driveThru");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingIsNull() {
            addCriterion("good_for_dancing is null");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingIsNotNull() {
            addCriterion("good_for_dancing is not null");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingEqualTo(Boolean value) {
            addCriterion("good_for_dancing =", value, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingNotEqualTo(Boolean value) {
            addCriterion("good_for_dancing <>", value, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingGreaterThan(Boolean value) {
            addCriterion("good_for_dancing >", value, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("good_for_dancing >=", value, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingLessThan(Boolean value) {
            addCriterion("good_for_dancing <", value, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingLessThanOrEqualTo(Boolean value) {
            addCriterion("good_for_dancing <=", value, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingIn(List<Boolean> values) {
            addCriterion("good_for_dancing in", values, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingNotIn(List<Boolean> values) {
            addCriterion("good_for_dancing not in", values, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingBetween(Boolean value1, Boolean value2) {
            addCriterion("good_for_dancing between", value1, value2, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForDancingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("good_for_dancing not between", value1, value2, "goodForDancing");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsIsNull() {
            addCriterion("good_for_groups is null");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsIsNotNull() {
            addCriterion("good_for_groups is not null");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsEqualTo(Boolean value) {
            addCriterion("good_for_groups =", value, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsNotEqualTo(Boolean value) {
            addCriterion("good_for_groups <>", value, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsGreaterThan(Boolean value) {
            addCriterion("good_for_groups >", value, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("good_for_groups >=", value, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsLessThan(Boolean value) {
            addCriterion("good_for_groups <", value, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsLessThanOrEqualTo(Boolean value) {
            addCriterion("good_for_groups <=", value, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsIn(List<Boolean> values) {
            addCriterion("good_for_groups in", values, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsNotIn(List<Boolean> values) {
            addCriterion("good_for_groups not in", values, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsBetween(Boolean value1, Boolean value2) {
            addCriterion("good_for_groups between", value1, value2, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForGroupsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("good_for_groups not between", value1, value2, "goodForGroups");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsIsNull() {
            addCriterion("good_for_kids is null");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsIsNotNull() {
            addCriterion("good_for_kids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsEqualTo(Boolean value) {
            addCriterion("good_for_kids =", value, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsNotEqualTo(Boolean value) {
            addCriterion("good_for_kids <>", value, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsGreaterThan(Boolean value) {
            addCriterion("good_for_kids >", value, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("good_for_kids >=", value, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsLessThan(Boolean value) {
            addCriterion("good_for_kids <", value, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsLessThanOrEqualTo(Boolean value) {
            addCriterion("good_for_kids <=", value, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsIn(List<Boolean> values) {
            addCriterion("good_for_kids in", values, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsNotIn(List<Boolean> values) {
            addCriterion("good_for_kids not in", values, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsBetween(Boolean value1, Boolean value2) {
            addCriterion("good_for_kids between", value1, value2, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andGoodForKidsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("good_for_kids not between", value1, value2, "goodForKids");
            return (Criteria) this;
        }

        public Criteria andHappyHourIsNull() {
            addCriterion("happy_hour is null");
            return (Criteria) this;
        }

        public Criteria andHappyHourIsNotNull() {
            addCriterion("happy_hour is not null");
            return (Criteria) this;
        }

        public Criteria andHappyHourEqualTo(Boolean value) {
            addCriterion("happy_hour =", value, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourNotEqualTo(Boolean value) {
            addCriterion("happy_hour <>", value, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourGreaterThan(Boolean value) {
            addCriterion("happy_hour >", value, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourGreaterThanOrEqualTo(Boolean value) {
            addCriterion("happy_hour >=", value, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourLessThan(Boolean value) {
            addCriterion("happy_hour <", value, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourLessThanOrEqualTo(Boolean value) {
            addCriterion("happy_hour <=", value, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourIn(List<Boolean> values) {
            addCriterion("happy_hour in", values, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourNotIn(List<Boolean> values) {
            addCriterion("happy_hour not in", values, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourBetween(Boolean value1, Boolean value2) {
            addCriterion("happy_hour between", value1, value2, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHappyHourNotBetween(Boolean value1, Boolean value2) {
            addCriterion("happy_hour not between", value1, value2, "happyHour");
            return (Criteria) this;
        }

        public Criteria andHasTvIsNull() {
            addCriterion("has_tv is null");
            return (Criteria) this;
        }

        public Criteria andHasTvIsNotNull() {
            addCriterion("has_tv is not null");
            return (Criteria) this;
        }

        public Criteria andHasTvEqualTo(Boolean value) {
            addCriterion("has_tv =", value, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvNotEqualTo(Boolean value) {
            addCriterion("has_tv <>", value, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvGreaterThan(Boolean value) {
            addCriterion("has_tv >", value, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_tv >=", value, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvLessThan(Boolean value) {
            addCriterion("has_tv <", value, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvLessThanOrEqualTo(Boolean value) {
            addCriterion("has_tv <=", value, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvIn(List<Boolean> values) {
            addCriterion("has_tv in", values, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvNotIn(List<Boolean> values) {
            addCriterion("has_tv not in", values, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvBetween(Boolean value1, Boolean value2) {
            addCriterion("has_tv between", value1, value2, "hasTv");
            return (Criteria) this;
        }

        public Criteria andHasTvNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_tv not between", value1, value2, "hasTv");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelIsNull() {
            addCriterion("noise_level is null");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelIsNotNull() {
            addCriterion("noise_level is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelEqualTo(String value) {
            addCriterion("noise_level =", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelNotEqualTo(String value) {
            addCriterion("noise_level <>", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelGreaterThan(String value) {
            addCriterion("noise_level >", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelGreaterThanOrEqualTo(String value) {
            addCriterion("noise_level >=", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelLessThan(String value) {
            addCriterion("noise_level <", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelLessThanOrEqualTo(String value) {
            addCriterion("noise_level <=", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelLike(String value) {
            addCriterion("noise_level like", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelNotLike(String value) {
            addCriterion("noise_level not like", value, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelIn(List<String> values) {
            addCriterion("noise_level in", values, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelNotIn(List<String> values) {
            addCriterion("noise_level not in", values, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelBetween(String value1, String value2) {
            addCriterion("noise_level between", value1, value2, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andNoiseLevelNotBetween(String value1, String value2) {
            addCriterion("noise_level not between", value1, value2, "noiseLevel");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursIsNull() {
            addCriterion("open_24_hours is null");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursIsNotNull() {
            addCriterion("open_24_hours is not null");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursEqualTo(Boolean value) {
            addCriterion("open_24_hours =", value, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursNotEqualTo(Boolean value) {
            addCriterion("open_24_hours <>", value, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursGreaterThan(Boolean value) {
            addCriterion("open_24_hours >", value, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open_24_hours >=", value, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursLessThan(Boolean value) {
            addCriterion("open_24_hours <", value, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursLessThanOrEqualTo(Boolean value) {
            addCriterion("open_24_hours <=", value, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursIn(List<Boolean> values) {
            addCriterion("open_24_hours in", values, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursNotIn(List<Boolean> values) {
            addCriterion("open_24_hours not in", values, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursBetween(Boolean value1, Boolean value2) {
            addCriterion("open_24_hours between", value1, value2, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOpen24HoursNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open_24_hours not between", value1, value2, "open24Hours");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterIsNull() {
            addCriterion("order_at_counter is null");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterIsNotNull() {
            addCriterion("order_at_counter is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterEqualTo(Boolean value) {
            addCriterion("order_at_counter =", value, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterNotEqualTo(Boolean value) {
            addCriterion("order_at_counter <>", value, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterGreaterThan(Boolean value) {
            addCriterion("order_at_counter >", value, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_at_counter >=", value, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterLessThan(Boolean value) {
            addCriterion("order_at_counter <", value, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterLessThanOrEqualTo(Boolean value) {
            addCriterion("order_at_counter <=", value, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterIn(List<Boolean> values) {
            addCriterion("order_at_counter in", values, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterNotIn(List<Boolean> values) {
            addCriterion("order_at_counter not in", values, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterBetween(Boolean value1, Boolean value2) {
            addCriterion("order_at_counter between", value1, value2, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOrderAtCounterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_at_counter not between", value1, value2, "orderAtCounter");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingIsNull() {
            addCriterion("outdoor_seating is null");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingIsNotNull() {
            addCriterion("outdoor_seating is not null");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingEqualTo(Boolean value) {
            addCriterion("outdoor_seating =", value, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingNotEqualTo(Boolean value) {
            addCriterion("outdoor_seating <>", value, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingGreaterThan(Boolean value) {
            addCriterion("outdoor_seating >", value, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("outdoor_seating >=", value, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingLessThan(Boolean value) {
            addCriterion("outdoor_seating <", value, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingLessThanOrEqualTo(Boolean value) {
            addCriterion("outdoor_seating <=", value, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingIn(List<Boolean> values) {
            addCriterion("outdoor_seating in", values, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingNotIn(List<Boolean> values) {
            addCriterion("outdoor_seating not in", values, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingBetween(Boolean value1, Boolean value2) {
            addCriterion("outdoor_seating between", value1, value2, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andOutdoorSeatingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("outdoor_seating not between", value1, value2, "outdoorSeating");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNull() {
            addCriterion("price_range is null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNotNull() {
            addCriterion("price_range is not null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeEqualTo(Boolean value) {
            addCriterion("price_range =", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotEqualTo(Boolean value) {
            addCriterion("price_range <>", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThan(Boolean value) {
            addCriterion("price_range >", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("price_range >=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThan(Boolean value) {
            addCriterion("price_range <", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThanOrEqualTo(Boolean value) {
            addCriterion("price_range <=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIn(List<Boolean> values) {
            addCriterion("price_range in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotIn(List<Boolean> values) {
            addCriterion("price_range not in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeBetween(Boolean value1, Boolean value2) {
            addCriterion("price_range between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("price_range not between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andSmokingIsNull() {
            addCriterion("smoking is null");
            return (Criteria) this;
        }

        public Criteria andSmokingIsNotNull() {
            addCriterion("smoking is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingEqualTo(String value) {
            addCriterion("smoking =", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotEqualTo(String value) {
            addCriterion("smoking <>", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingGreaterThan(String value) {
            addCriterion("smoking >", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingGreaterThanOrEqualTo(String value) {
            addCriterion("smoking >=", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLessThan(String value) {
            addCriterion("smoking <", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLessThanOrEqualTo(String value) {
            addCriterion("smoking <=", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLike(String value) {
            addCriterion("smoking like", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotLike(String value) {
            addCriterion("smoking not like", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingIn(List<String> values) {
            addCriterion("smoking in", values, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotIn(List<String> values) {
            addCriterion("smoking not in", values, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingBetween(String value1, String value2) {
            addCriterion("smoking between", value1, value2, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotBetween(String value1, String value2) {
            addCriterion("smoking not between", value1, value2, "smoking");
            return (Criteria) this;
        }

        public Criteria andTakeOutIsNull() {
            addCriterion("take_out is null");
            return (Criteria) this;
        }

        public Criteria andTakeOutIsNotNull() {
            addCriterion("take_out is not null");
            return (Criteria) this;
        }

        public Criteria andTakeOutEqualTo(Boolean value) {
            addCriterion("take_out =", value, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutNotEqualTo(Boolean value) {
            addCriterion("take_out <>", value, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutGreaterThan(Boolean value) {
            addCriterion("take_out >", value, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutGreaterThanOrEqualTo(Boolean value) {
            addCriterion("take_out >=", value, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutLessThan(Boolean value) {
            addCriterion("take_out <", value, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutLessThanOrEqualTo(Boolean value) {
            addCriterion("take_out <=", value, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutIn(List<Boolean> values) {
            addCriterion("take_out in", values, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutNotIn(List<Boolean> values) {
            addCriterion("take_out not in", values, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutBetween(Boolean value1, Boolean value2) {
            addCriterion("take_out between", value1, value2, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakeOutNotBetween(Boolean value1, Boolean value2) {
            addCriterion("take_out not between", value1, value2, "takeOut");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsIsNull() {
            addCriterion("takes_reservations is null");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsIsNotNull() {
            addCriterion("takes_reservations is not null");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsEqualTo(Boolean value) {
            addCriterion("takes_reservations =", value, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsNotEqualTo(Boolean value) {
            addCriterion("takes_reservations <>", value, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsGreaterThan(Boolean value) {
            addCriterion("takes_reservations >", value, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("takes_reservations >=", value, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsLessThan(Boolean value) {
            addCriterion("takes_reservations <", value, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsLessThanOrEqualTo(Boolean value) {
            addCriterion("takes_reservations <=", value, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsIn(List<Boolean> values) {
            addCriterion("takes_reservations in", values, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsNotIn(List<Boolean> values) {
            addCriterion("takes_reservations not in", values, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsBetween(Boolean value1, Boolean value2) {
            addCriterion("takes_reservations between", value1, value2, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andTakesReservationsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("takes_reservations not between", value1, value2, "takesReservations");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceIsNull() {
            addCriterion("waiter_service is null");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceIsNotNull() {
            addCriterion("waiter_service is not null");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceEqualTo(Boolean value) {
            addCriterion("waiter_service =", value, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceNotEqualTo(Boolean value) {
            addCriterion("waiter_service <>", value, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceGreaterThan(Boolean value) {
            addCriterion("waiter_service >", value, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("waiter_service >=", value, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceLessThan(Boolean value) {
            addCriterion("waiter_service <", value, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceLessThanOrEqualTo(Boolean value) {
            addCriterion("waiter_service <=", value, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceIn(List<Boolean> values) {
            addCriterion("waiter_service in", values, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceNotIn(List<Boolean> values) {
            addCriterion("waiter_service not in", values, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceBetween(Boolean value1, Boolean value2) {
            addCriterion("waiter_service between", value1, value2, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWaiterServiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("waiter_service not between", value1, value2, "waiterService");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleIsNull() {
            addCriterion("wheelchair_accessible is null");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleIsNotNull() {
            addCriterion("wheelchair_accessible is not null");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleEqualTo(Boolean value) {
            addCriterion("wheelchair_accessible =", value, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleNotEqualTo(Boolean value) {
            addCriterion("wheelchair_accessible <>", value, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleGreaterThan(Boolean value) {
            addCriterion("wheelchair_accessible >", value, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wheelchair_accessible >=", value, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleLessThan(Boolean value) {
            addCriterion("wheelchair_accessible <", value, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleLessThanOrEqualTo(Boolean value) {
            addCriterion("wheelchair_accessible <=", value, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleIn(List<Boolean> values) {
            addCriterion("wheelchair_accessible in", values, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleNotIn(List<Boolean> values) {
            addCriterion("wheelchair_accessible not in", values, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleBetween(Boolean value1, Boolean value2) {
            addCriterion("wheelchair_accessible between", value1, value2, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWheelchairAccessibleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wheelchair_accessible not between", value1, value2, "wheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andWiFiIsNull() {
            addCriterion("wi_fi is null");
            return (Criteria) this;
        }

        public Criteria andWiFiIsNotNull() {
            addCriterion("wi_fi is not null");
            return (Criteria) this;
        }

        public Criteria andWiFiEqualTo(String value) {
            addCriterion("wi_fi =", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiNotEqualTo(String value) {
            addCriterion("wi_fi <>", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiGreaterThan(String value) {
            addCriterion("wi_fi >", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiGreaterThanOrEqualTo(String value) {
            addCriterion("wi_fi >=", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiLessThan(String value) {
            addCriterion("wi_fi <", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiLessThanOrEqualTo(String value) {
            addCriterion("wi_fi <=", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiLike(String value) {
            addCriterion("wi_fi like", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiNotLike(String value) {
            addCriterion("wi_fi not like", value, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiIn(List<String> values) {
            addCriterion("wi_fi in", values, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiNotIn(List<String> values) {
            addCriterion("wi_fi not in", values, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiBetween(String value1, String value2) {
            addCriterion("wi_fi between", value1, value2, "wiFi");
            return (Criteria) this;
        }

        public Criteria andWiFiNotBetween(String value1, String value2) {
            addCriterion("wi_fi not between", value1, value2, "wiFi");
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
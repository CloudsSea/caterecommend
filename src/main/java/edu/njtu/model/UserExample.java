package edu.njtu.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIntIsNull() {
            addCriterion("user_id_int is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIntIsNotNull() {
            addCriterion("user_id_int is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdIntEqualTo(Long value) {
            addCriterion("user_id_int =", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntNotEqualTo(Long value) {
            addCriterion("user_id_int <>", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntGreaterThan(Long value) {
            addCriterion("user_id_int >", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id_int >=", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntLessThan(Long value) {
            addCriterion("user_id_int <", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntLessThanOrEqualTo(Long value) {
            addCriterion("user_id_int <=", value, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntIn(List<Long> values) {
            addCriterion("user_id_int in", values, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntNotIn(List<Long> values) {
            addCriterion("user_id_int not in", values, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntBetween(Long value1, Long value2) {
            addCriterion("user_id_int between", value1, value2, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIntNotBetween(Long value1, Long value2) {
            addCriterion("user_id_int not between", value1, value2, "userIdInt");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAverageStarsIsNull() {
            addCriterion("average_stars is null");
            return (Criteria) this;
        }

        public Criteria andAverageStarsIsNotNull() {
            addCriterion("average_stars is not null");
            return (Criteria) this;
        }

        public Criteria andAverageStarsEqualTo(Double value) {
            addCriterion("average_stars =", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsNotEqualTo(Double value) {
            addCriterion("average_stars <>", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsGreaterThan(Double value) {
            addCriterion("average_stars >", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsGreaterThanOrEqualTo(Double value) {
            addCriterion("average_stars >=", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsLessThan(Double value) {
            addCriterion("average_stars <", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsLessThanOrEqualTo(Double value) {
            addCriterion("average_stars <=", value, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsIn(List<Double> values) {
            addCriterion("average_stars in", values, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsNotIn(List<Double> values) {
            addCriterion("average_stars not in", values, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsBetween(Double value1, Double value2) {
            addCriterion("average_stars between", value1, value2, "averageStars");
            return (Criteria) this;
        }

        public Criteria andAverageStarsNotBetween(Double value1, Double value2) {
            addCriterion("average_stars not between", value1, value2, "averageStars");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolIsNull() {
            addCriterion("compliments_cool is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolIsNotNull() {
            addCriterion("compliments_cool is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolEqualTo(Integer value) {
            addCriterion("compliments_cool =", value, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolNotEqualTo(Integer value) {
            addCriterion("compliments_cool <>", value, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolGreaterThan(Integer value) {
            addCriterion("compliments_cool >", value, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_cool >=", value, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolLessThan(Integer value) {
            addCriterion("compliments_cool <", value, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_cool <=", value, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolIn(List<Integer> values) {
            addCriterion("compliments_cool in", values, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolNotIn(List<Integer> values) {
            addCriterion("compliments_cool not in", values, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolBetween(Integer value1, Integer value2) {
            addCriterion("compliments_cool between", value1, value2, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCoolNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_cool not between", value1, value2, "complimentsCool");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteIsNull() {
            addCriterion("compliments_cute is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteIsNotNull() {
            addCriterion("compliments_cute is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteEqualTo(Integer value) {
            addCriterion("compliments_cute =", value, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteNotEqualTo(Integer value) {
            addCriterion("compliments_cute <>", value, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteGreaterThan(Integer value) {
            addCriterion("compliments_cute >", value, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_cute >=", value, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteLessThan(Integer value) {
            addCriterion("compliments_cute <", value, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_cute <=", value, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteIn(List<Integer> values) {
            addCriterion("compliments_cute in", values, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteNotIn(List<Integer> values) {
            addCriterion("compliments_cute not in", values, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteBetween(Integer value1, Integer value2) {
            addCriterion("compliments_cute between", value1, value2, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsCuteNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_cute not between", value1, value2, "complimentsCute");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyIsNull() {
            addCriterion("compliments_funny is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyIsNotNull() {
            addCriterion("compliments_funny is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyEqualTo(Integer value) {
            addCriterion("compliments_funny =", value, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyNotEqualTo(Integer value) {
            addCriterion("compliments_funny <>", value, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyGreaterThan(Integer value) {
            addCriterion("compliments_funny >", value, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_funny >=", value, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyLessThan(Integer value) {
            addCriterion("compliments_funny <", value, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_funny <=", value, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyIn(List<Integer> values) {
            addCriterion("compliments_funny in", values, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyNotIn(List<Integer> values) {
            addCriterion("compliments_funny not in", values, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyBetween(Integer value1, Integer value2) {
            addCriterion("compliments_funny between", value1, value2, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsFunnyNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_funny not between", value1, value2, "complimentsFunny");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotIsNull() {
            addCriterion("compliments_hot is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotIsNotNull() {
            addCriterion("compliments_hot is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotEqualTo(Integer value) {
            addCriterion("compliments_hot =", value, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotNotEqualTo(Integer value) {
            addCriterion("compliments_hot <>", value, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotGreaterThan(Integer value) {
            addCriterion("compliments_hot >", value, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_hot >=", value, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotLessThan(Integer value) {
            addCriterion("compliments_hot <", value, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_hot <=", value, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotIn(List<Integer> values) {
            addCriterion("compliments_hot in", values, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotNotIn(List<Integer> values) {
            addCriterion("compliments_hot not in", values, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_hot between", value1, value2, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_hot not between", value1, value2, "complimentsHot");
            return (Criteria) this;
        }

        public Criteria andComplimentsListIsNull() {
            addCriterion("compliments_list is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsListIsNotNull() {
            addCriterion("compliments_list is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsListEqualTo(Integer value) {
            addCriterion("compliments_list =", value, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListNotEqualTo(Integer value) {
            addCriterion("compliments_list <>", value, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListGreaterThan(Integer value) {
            addCriterion("compliments_list >", value, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_list >=", value, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListLessThan(Integer value) {
            addCriterion("compliments_list <", value, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_list <=", value, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListIn(List<Integer> values) {
            addCriterion("compliments_list in", values, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListNotIn(List<Integer> values) {
            addCriterion("compliments_list not in", values, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListBetween(Integer value1, Integer value2) {
            addCriterion("compliments_list between", value1, value2, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsListNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_list not between", value1, value2, "complimentsList");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreIsNull() {
            addCriterion("compliments_more is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreIsNotNull() {
            addCriterion("compliments_more is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreEqualTo(Integer value) {
            addCriterion("compliments_more =", value, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreNotEqualTo(Integer value) {
            addCriterion("compliments_more <>", value, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreGreaterThan(Integer value) {
            addCriterion("compliments_more >", value, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_more >=", value, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreLessThan(Integer value) {
            addCriterion("compliments_more <", value, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_more <=", value, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreIn(List<Integer> values) {
            addCriterion("compliments_more in", values, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreNotIn(List<Integer> values) {
            addCriterion("compliments_more not in", values, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreBetween(Integer value1, Integer value2) {
            addCriterion("compliments_more between", value1, value2, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsMoreNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_more not between", value1, value2, "complimentsMore");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteIsNull() {
            addCriterion("compliments_note is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteIsNotNull() {
            addCriterion("compliments_note is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteEqualTo(Integer value) {
            addCriterion("compliments_note =", value, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteNotEqualTo(Integer value) {
            addCriterion("compliments_note <>", value, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteGreaterThan(Integer value) {
            addCriterion("compliments_note >", value, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_note >=", value, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteLessThan(Integer value) {
            addCriterion("compliments_note <", value, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_note <=", value, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteIn(List<Integer> values) {
            addCriterion("compliments_note in", values, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteNotIn(List<Integer> values) {
            addCriterion("compliments_note not in", values, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteBetween(Integer value1, Integer value2) {
            addCriterion("compliments_note between", value1, value2, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsNoteNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_note not between", value1, value2, "complimentsNote");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosIsNull() {
            addCriterion("compliments_photos is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosIsNotNull() {
            addCriterion("compliments_photos is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosEqualTo(Integer value) {
            addCriterion("compliments_photos =", value, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosNotEqualTo(Integer value) {
            addCriterion("compliments_photos <>", value, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosGreaterThan(Integer value) {
            addCriterion("compliments_photos >", value, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_photos >=", value, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosLessThan(Integer value) {
            addCriterion("compliments_photos <", value, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_photos <=", value, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosIn(List<Integer> values) {
            addCriterion("compliments_photos in", values, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosNotIn(List<Integer> values) {
            addCriterion("compliments_photos not in", values, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosBetween(Integer value1, Integer value2) {
            addCriterion("compliments_photos between", value1, value2, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPhotosNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_photos not between", value1, value2, "complimentsPhotos");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainIsNull() {
            addCriterion("compliments_plain is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainIsNotNull() {
            addCriterion("compliments_plain is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainEqualTo(Integer value) {
            addCriterion("compliments_plain =", value, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainNotEqualTo(Integer value) {
            addCriterion("compliments_plain <>", value, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainGreaterThan(Integer value) {
            addCriterion("compliments_plain >", value, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_plain >=", value, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainLessThan(Integer value) {
            addCriterion("compliments_plain <", value, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_plain <=", value, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainIn(List<Integer> values) {
            addCriterion("compliments_plain in", values, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainNotIn(List<Integer> values) {
            addCriterion("compliments_plain not in", values, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainBetween(Integer value1, Integer value2) {
            addCriterion("compliments_plain between", value1, value2, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsPlainNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_plain not between", value1, value2, "complimentsPlain");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileIsNull() {
            addCriterion("compliments_profile is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileIsNotNull() {
            addCriterion("compliments_profile is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileEqualTo(Integer value) {
            addCriterion("compliments_profile =", value, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileNotEqualTo(Integer value) {
            addCriterion("compliments_profile <>", value, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileGreaterThan(Integer value) {
            addCriterion("compliments_profile >", value, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_profile >=", value, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileLessThan(Integer value) {
            addCriterion("compliments_profile <", value, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_profile <=", value, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileIn(List<Integer> values) {
            addCriterion("compliments_profile in", values, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileNotIn(List<Integer> values) {
            addCriterion("compliments_profile not in", values, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileBetween(Integer value1, Integer value2) {
            addCriterion("compliments_profile between", value1, value2, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsProfileNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_profile not between", value1, value2, "complimentsProfile");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterIsNull() {
            addCriterion("compliments_writer is null");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterIsNotNull() {
            addCriterion("compliments_writer is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterEqualTo(Integer value) {
            addCriterion("compliments_writer =", value, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterNotEqualTo(Integer value) {
            addCriterion("compliments_writer <>", value, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterGreaterThan(Integer value) {
            addCriterion("compliments_writer >", value, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterGreaterThanOrEqualTo(Integer value) {
            addCriterion("compliments_writer >=", value, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterLessThan(Integer value) {
            addCriterion("compliments_writer <", value, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterLessThanOrEqualTo(Integer value) {
            addCriterion("compliments_writer <=", value, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterIn(List<Integer> values) {
            addCriterion("compliments_writer in", values, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterNotIn(List<Integer> values) {
            addCriterion("compliments_writer not in", values, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterBetween(Integer value1, Integer value2) {
            addCriterion("compliments_writer between", value1, value2, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andComplimentsWriterNotBetween(Integer value1, Integer value2) {
            addCriterion("compliments_writer not between", value1, value2, "complimentsWriter");
            return (Criteria) this;
        }

        public Criteria andFansIsNull() {
            addCriterion("fans is null");
            return (Criteria) this;
        }

        public Criteria andFansIsNotNull() {
            addCriterion("fans is not null");
            return (Criteria) this;
        }

        public Criteria andFansEqualTo(Integer value) {
            addCriterion("fans =", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotEqualTo(Integer value) {
            addCriterion("fans <>", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThan(Integer value) {
            addCriterion("fans >", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans >=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThan(Integer value) {
            addCriterion("fans <", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThanOrEqualTo(Integer value) {
            addCriterion("fans <=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansIn(List<Integer> values) {
            addCriterion("fans in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotIn(List<Integer> values) {
            addCriterion("fans not in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansBetween(Integer value1, Integer value2) {
            addCriterion("fans between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotBetween(Integer value1, Integer value2) {
            addCriterion("fans not between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andReviewCountIsNull() {
            addCriterion("review_count is null");
            return (Criteria) this;
        }

        public Criteria andReviewCountIsNotNull() {
            addCriterion("review_count is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCountEqualTo(Integer value) {
            addCriterion("review_count =", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotEqualTo(Integer value) {
            addCriterion("review_count <>", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountGreaterThan(Integer value) {
            addCriterion("review_count >", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_count >=", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountLessThan(Integer value) {
            addCriterion("review_count <", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountLessThanOrEqualTo(Integer value) {
            addCriterion("review_count <=", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountIn(List<Integer> values) {
            addCriterion("review_count in", values, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotIn(List<Integer> values) {
            addCriterion("review_count not in", values, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountBetween(Integer value1, Integer value2) {
            addCriterion("review_count between", value1, value2, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("review_count not between", value1, value2, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andVotesCoolIsNull() {
            addCriterion("votes_cool is null");
            return (Criteria) this;
        }

        public Criteria andVotesCoolIsNotNull() {
            addCriterion("votes_cool is not null");
            return (Criteria) this;
        }

        public Criteria andVotesCoolEqualTo(Integer value) {
            addCriterion("votes_cool =", value, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolNotEqualTo(Integer value) {
            addCriterion("votes_cool <>", value, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolGreaterThan(Integer value) {
            addCriterion("votes_cool >", value, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("votes_cool >=", value, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolLessThan(Integer value) {
            addCriterion("votes_cool <", value, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolLessThanOrEqualTo(Integer value) {
            addCriterion("votes_cool <=", value, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolIn(List<Integer> values) {
            addCriterion("votes_cool in", values, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolNotIn(List<Integer> values) {
            addCriterion("votes_cool not in", values, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolBetween(Integer value1, Integer value2) {
            addCriterion("votes_cool between", value1, value2, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesCoolNotBetween(Integer value1, Integer value2) {
            addCriterion("votes_cool not between", value1, value2, "votesCool");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyIsNull() {
            addCriterion("votes_funny is null");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyIsNotNull() {
            addCriterion("votes_funny is not null");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyEqualTo(Integer value) {
            addCriterion("votes_funny =", value, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyNotEqualTo(Integer value) {
            addCriterion("votes_funny <>", value, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyGreaterThan(Integer value) {
            addCriterion("votes_funny >", value, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("votes_funny >=", value, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyLessThan(Integer value) {
            addCriterion("votes_funny <", value, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyLessThanOrEqualTo(Integer value) {
            addCriterion("votes_funny <=", value, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyIn(List<Integer> values) {
            addCriterion("votes_funny in", values, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyNotIn(List<Integer> values) {
            addCriterion("votes_funny not in", values, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyBetween(Integer value1, Integer value2) {
            addCriterion("votes_funny between", value1, value2, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesFunnyNotBetween(Integer value1, Integer value2) {
            addCriterion("votes_funny not between", value1, value2, "votesFunny");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulIsNull() {
            addCriterion("votes_useful is null");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulIsNotNull() {
            addCriterion("votes_useful is not null");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulEqualTo(Integer value) {
            addCriterion("votes_useful =", value, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulNotEqualTo(Integer value) {
            addCriterion("votes_useful <>", value, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulGreaterThan(Integer value) {
            addCriterion("votes_useful >", value, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulGreaterThanOrEqualTo(Integer value) {
            addCriterion("votes_useful >=", value, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulLessThan(Integer value) {
            addCriterion("votes_useful <", value, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulLessThanOrEqualTo(Integer value) {
            addCriterion("votes_useful <=", value, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulIn(List<Integer> values) {
            addCriterion("votes_useful in", values, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulNotIn(List<Integer> values) {
            addCriterion("votes_useful not in", values, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulBetween(Integer value1, Integer value2) {
            addCriterion("votes_useful between", value1, value2, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andVotesUsefulNotBetween(Integer value1, Integer value2) {
            addCriterion("votes_useful not between", value1, value2, "votesUseful");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceIsNull() {
            addCriterion("yelping_since is null");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceIsNotNull() {
            addCriterion("yelping_since is not null");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceEqualTo(String value) {
            addCriterion("yelping_since =", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotEqualTo(String value) {
            addCriterion("yelping_since <>", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceGreaterThan(String value) {
            addCriterion("yelping_since >", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceGreaterThanOrEqualTo(String value) {
            addCriterion("yelping_since >=", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceLessThan(String value) {
            addCriterion("yelping_since <", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceLessThanOrEqualTo(String value) {
            addCriterion("yelping_since <=", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceLike(String value) {
            addCriterion("yelping_since like", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotLike(String value) {
            addCriterion("yelping_since not like", value, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceIn(List<String> values) {
            addCriterion("yelping_since in", values, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotIn(List<String> values) {
            addCriterion("yelping_since not in", values, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceBetween(String value1, String value2) {
            addCriterion("yelping_since between", value1, value2, "yelpingSince");
            return (Criteria) this;
        }

        public Criteria andYelpingSinceNotBetween(String value1, String value2) {
            addCriterion("yelping_since not between", value1, value2, "yelpingSince");
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
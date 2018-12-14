package com.example.demo.model.survey;

import com.example.demo.util.Limit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuesTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    private Limit limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public QuesTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    public Limit getLimit() {
        return this.limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public void addCriterion(Criterion criterion) {
            if (criterion == null) {
                throw new RuntimeException("Value for criterion cannot be null");
            }
            criteria.add(criterion);
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andQuesTypeIdIsNull() {
            addCriterion("ques_type_id is null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdIsNotNull() {
            addCriterion("ques_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdEqualTo(Long value) {
            addCriterion("ques_type_id =", value, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdNotEqualTo(Long value) {
            addCriterion("ques_type_id <>", value, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdGreaterThan(Long value) {
            addCriterion("ques_type_id >", value, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ques_type_id >=", value, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdLessThan(Long value) {
            addCriterion("ques_type_id <", value, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("ques_type_id <=", value, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdIn(List<Long> values) {
            addCriterion("ques_type_id in", values, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdNotIn(List<Long> values) {
            addCriterion("ques_type_id not in", values, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdBetween(Long value1, Long value2) {
            addCriterion("ques_type_id between", value1, value2, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("ques_type_id not between", value1, value2, "quesTypeId");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameIsNull() {
            addCriterion("ques_type_name is null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameIsNotNull() {
            addCriterion("ques_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameEqualTo(String value) {
            addCriterion("ques_type_name =", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameNotEqualTo(String value) {
            addCriterion("ques_type_name <>", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameGreaterThan(String value) {
            addCriterion("ques_type_name >", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ques_type_name >=", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameLessThan(String value) {
            addCriterion("ques_type_name <", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameLessThanOrEqualTo(String value) {
            addCriterion("ques_type_name <=", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameLike(String value) {
            addCriterion("ques_type_name like", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameNotLike(String value) {
            addCriterion("ques_type_name not like", value, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameIn(List<String> values) {
            addCriterion("ques_type_name in", values, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameNotIn(List<String> values) {
            addCriterion("ques_type_name not in", values, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameBetween(String value1, String value2) {
            addCriterion("ques_type_name between", value1, value2, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeNameNotBetween(String value1, String value2) {
            addCriterion("ques_type_name not between", value1, value2, "quesTypeName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameIsNull() {
            addCriterion("ques_type_english_name is null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameIsNotNull() {
            addCriterion("ques_type_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameEqualTo(String value) {
            addCriterion("ques_type_english_name =", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameNotEqualTo(String value) {
            addCriterion("ques_type_english_name <>", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameGreaterThan(String value) {
            addCriterion("ques_type_english_name >", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("ques_type_english_name >=", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameLessThan(String value) {
            addCriterion("ques_type_english_name <", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("ques_type_english_name <=", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameLike(String value) {
            addCriterion("ques_type_english_name like", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameNotLike(String value) {
            addCriterion("ques_type_english_name not like", value, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameIn(List<String> values) {
            addCriterion("ques_type_english_name in", values, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameNotIn(List<String> values) {
            addCriterion("ques_type_english_name not in", values, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameBetween(String value1, String value2) {
            addCriterion("ques_type_english_name between", value1, value2, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeEnglishNameNotBetween(String value1, String value2) {
            addCriterion("ques_type_english_name not between", value1, value2, "quesTypeEnglishName");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksIsNull() {
            addCriterion("ques_type_remarks is null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksIsNotNull() {
            addCriterion("ques_type_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksEqualTo(String value) {
            addCriterion("ques_type_remarks =", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksNotEqualTo(String value) {
            addCriterion("ques_type_remarks <>", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksGreaterThan(String value) {
            addCriterion("ques_type_remarks >", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("ques_type_remarks >=", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksLessThan(String value) {
            addCriterion("ques_type_remarks <", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksLessThanOrEqualTo(String value) {
            addCriterion("ques_type_remarks <=", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksLike(String value) {
            addCriterion("ques_type_remarks like", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksNotLike(String value) {
            addCriterion("ques_type_remarks not like", value, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksIn(List<String> values) {
            addCriterion("ques_type_remarks in", values, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksNotIn(List<String> values) {
            addCriterion("ques_type_remarks not in", values, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksBetween(String value1, String value2) {
            addCriterion("ques_type_remarks between", value1, value2, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesTypeRemarksNotBetween(String value1, String value2) {
            addCriterion("ques_type_remarks not between", value1, value2, "quesTypeRemarks");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdIsNull() {
            addCriterion("ques_survey_id is null");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdIsNotNull() {
            addCriterion("ques_survey_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdEqualTo(Long value) {
            addCriterion("ques_survey_id =", value, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdNotEqualTo(Long value) {
            addCriterion("ques_survey_id <>", value, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdGreaterThan(Long value) {
            addCriterion("ques_survey_id >", value, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ques_survey_id >=", value, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdLessThan(Long value) {
            addCriterion("ques_survey_id <", value, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdLessThanOrEqualTo(Long value) {
            addCriterion("ques_survey_id <=", value, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdIn(List<Long> values) {
            addCriterion("ques_survey_id in", values, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdNotIn(List<Long> values) {
            addCriterion("ques_survey_id not in", values, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdBetween(Long value1, Long value2) {
            addCriterion("ques_survey_id between", value1, value2, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andQuesSurveyIdNotBetween(Long value1, Long value2) {
            addCriterion("ques_survey_id not between", value1, value2, "quesSurveyId");
            return (Criteria) this;
        }

        public Criteria andOrderByIdIsNull() {
            addCriterion("order_by_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIdIsNotNull() {
            addCriterion("order_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByIdEqualTo(Integer value) {
            addCriterion("order_by_id =", value, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdNotEqualTo(Integer value) {
            addCriterion("order_by_id <>", value, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdGreaterThan(Integer value) {
            addCriterion("order_by_id >", value, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_by_id >=", value, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdLessThan(Integer value) {
            addCriterion("order_by_id <", value, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_by_id <=", value, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdIn(List<Integer> values) {
            addCriterion("order_by_id in", values, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdNotIn(List<Integer> values) {
            addCriterion("order_by_id not in", values, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdBetween(Integer value1, Integer value2) {
            addCriterion("order_by_id between", value1, value2, "orderById");
            return (Criteria) this;
        }

        public Criteria andOrderByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_by_id not between", value1, value2, "orderById");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyIsNull() {
            addCriterion("is_background_survey is null");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyIsNotNull() {
            addCriterion("is_background_survey is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyEqualTo(Integer value) {
            addCriterion("is_background_survey =", value, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyNotEqualTo(Integer value) {
            addCriterion("is_background_survey <>", value, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyGreaterThan(Integer value) {
            addCriterion("is_background_survey >", value, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_background_survey >=", value, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyLessThan(Integer value) {
            addCriterion("is_background_survey <", value, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyLessThanOrEqualTo(Integer value) {
            addCriterion("is_background_survey <=", value, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyIn(List<Integer> values) {
            addCriterion("is_background_survey in", values, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyNotIn(List<Integer> values) {
            addCriterion("is_background_survey not in", values, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyBetween(Integer value1, Integer value2) {
            addCriterion("is_background_survey between", value1, value2, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsBackgroundSurveyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_background_survey not between", value1, value2, "isBackgroundSurvey");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_an_ques_type
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_an_ques_type
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private boolean orListValue;

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

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        public Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        public Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }

        public Criterion(List<Criterion> listCriterion) {
            super();
            this.value = listCriterion;
            this.orListValue = true;
        }

        public boolean isOrListValue() {
            return orListValue;
        }
    }
}
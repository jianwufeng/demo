package com.example.demo.model.survey;

import java.io.Serializable;
import java.util.Date;

public class QuesSurveyAnsweredDetail implements Serializable {
    /** 问卷调查每次作答唯一键 */
    private Long quesSurveyAnsweredId;

    /** 所属问卷ID */
    private Long quesSurveyId;

    /** 问卷名称 */
    private String quesSurveyName;

    /** 所属题目大类ID */
    private Long quesTypeId;

    /** 题目大类名称 */
    private String quesTypeName;

    /** 题目ID */
    private Long quesId;

    /** 题目名称 */
    private String quesName;

    /** 题目类型 1：单选，2：多选，3：填空 */
    private Integer quesType;

    /** 答案ID */
    private Long answerId;

    /** 答案内容 */
    private String answerName;

    /** 答案分数 */
    private String answerScore;

    /** 是否背景调查 0：否，1：是 */
    private Integer isBackgroundSurvey;

    /** 一次问卷提交标识 */
    private String userId;

    /** 是否删除 */
    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_an_ques_survey_answered_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_survey_answered_id
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_survey_answered_id
     *
     * @mbggenerated
     */
    public Long getQuesSurveyAnsweredId() {
        return quesSurveyAnsweredId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_survey_answered_id
     *
     * @param quesSurveyAnsweredId the value for t_an_ques_survey_answered_detail.ques_survey_answered_id
     *
     * @mbggenerated
     */
    public void setQuesSurveyAnsweredId(Long quesSurveyAnsweredId) {
        this.quesSurveyAnsweredId = quesSurveyAnsweredId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_survey_id
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_survey_id
     *
     * @mbggenerated
     */
    public Long getQuesSurveyId() {
        return quesSurveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_survey_id
     *
     * @param quesSurveyId the value for t_an_ques_survey_answered_detail.ques_survey_id
     *
     * @mbggenerated
     */
    public void setQuesSurveyId(Long quesSurveyId) {
        this.quesSurveyId = quesSurveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_survey_name
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_survey_name
     *
     * @mbggenerated
     */
    public String getQuesSurveyName() {
        return quesSurveyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_survey_name
     *
     * @param quesSurveyName the value for t_an_ques_survey_answered_detail.ques_survey_name
     *
     * @mbggenerated
     */
    public void setQuesSurveyName(String quesSurveyName) {
        this.quesSurveyName = quesSurveyName == null ? null : quesSurveyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_type_id
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_type_id
     *
     * @mbggenerated
     */
    public Long getQuesTypeId() {
        return quesTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_type_id
     *
     * @param quesTypeId the value for t_an_ques_survey_answered_detail.ques_type_id
     *
     * @mbggenerated
     */
    public void setQuesTypeId(Long quesTypeId) {
        this.quesTypeId = quesTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_type_name
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_type_name
     *
     * @mbggenerated
     */
    public String getQuesTypeName() {
        return quesTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_type_name
     *
     * @param quesTypeName the value for t_an_ques_survey_answered_detail.ques_type_name
     *
     * @mbggenerated
     */
    public void setQuesTypeName(String quesTypeName) {
        this.quesTypeName = quesTypeName == null ? null : quesTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_id
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_id
     *
     * @mbggenerated
     */
    public Long getQuesId() {
        return quesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_id
     *
     * @param quesId the value for t_an_ques_survey_answered_detail.ques_id
     *
     * @mbggenerated
     */
    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_name
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_name
     *
     * @mbggenerated
     */
    public String getQuesName() {
        return quesName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_name
     *
     * @param quesName the value for t_an_ques_survey_answered_detail.ques_name
     *
     * @mbggenerated
     */
    public void setQuesName(String quesName) {
        this.quesName = quesName == null ? null : quesName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.ques_type
     *
     * @return the value of t_an_ques_survey_answered_detail.ques_type
     *
     * @mbggenerated
     */
    public Integer getQuesType() {
        return quesType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.ques_type
     *
     * @param quesType the value for t_an_ques_survey_answered_detail.ques_type
     *
     * @mbggenerated
     */
    public void setQuesType(Integer quesType) {
        this.quesType = quesType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.answer_id
     *
     * @return the value of t_an_ques_survey_answered_detail.answer_id
     *
     * @mbggenerated
     */
    public Long getAnswerId() {
        return answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.answer_id
     *
     * @param answerId the value for t_an_ques_survey_answered_detail.answer_id
     *
     * @mbggenerated
     */
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.answer_name
     *
     * @return the value of t_an_ques_survey_answered_detail.answer_name
     *
     * @mbggenerated
     */
    public String getAnswerName() {
        return answerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.answer_name
     *
     * @param answerName the value for t_an_ques_survey_answered_detail.answer_name
     *
     * @mbggenerated
     */
    public void setAnswerName(String answerName) {
        this.answerName = answerName == null ? null : answerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.answer_score
     *
     * @return the value of t_an_ques_survey_answered_detail.answer_score
     *
     * @mbggenerated
     */
    public String getAnswerScore() {
        return answerScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.answer_score
     *
     * @param answerScore the value for t_an_ques_survey_answered_detail.answer_score
     *
     * @mbggenerated
     */
    public void setAnswerScore(String answerScore) {
        this.answerScore = answerScore == null ? null : answerScore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.is_background_survey
     *
     * @return the value of t_an_ques_survey_answered_detail.is_background_survey
     *
     * @mbggenerated
     */
    public Integer getIsBackgroundSurvey() {
        return isBackgroundSurvey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.is_background_survey
     *
     * @param isBackgroundSurvey the value for t_an_ques_survey_answered_detail.is_background_survey
     *
     * @mbggenerated
     */
    public void setIsBackgroundSurvey(Integer isBackgroundSurvey) {
        this.isBackgroundSurvey = isBackgroundSurvey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.user_id
     *
     * @return the value of t_an_ques_survey_answered_detail.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.user_id
     *
     * @param userId the value for t_an_ques_survey_answered_detail.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.is_delete
     *
     * @return the value of t_an_ques_survey_answered_detail.is_delete
     *
     * @mbggenerated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.is_delete
     *
     * @param isDelete the value for t_an_ques_survey_answered_detail.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.create_time
     *
     * @return the value of t_an_ques_survey_answered_detail.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.create_time
     *
     * @param createTime the value for t_an_ques_survey_answered_detail.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_survey_answered_detail.update_time
     *
     * @return the value of t_an_ques_survey_answered_detail.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_survey_answered_detail.update_time
     *
     * @param updateTime the value for t_an_ques_survey_answered_detail.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
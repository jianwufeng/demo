package com.example.demo.model.survey;

import java.io.Serializable;
import java.util.Date;

public class QuesAnswerDetail implements Serializable {
    /** 问题答案ID */
    private Long answerId;

    /** 问题答案名称 */
    private String answerName;

    /** 选项 1,2,3,4 或A,B,C,D */
    private String optionId;

    /** 题目ID */
    private Long quesId;

    /** 题目名称 */
    private String quesName;

    /** 所属问卷ID */
    private Long quesSurveyId;

    /** 所属题目大类ID */
    private Long quesTypeId;

    /** 排序1,2,3,4 */
    private Integer orderById;

    /** 是否删除 */
    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_an_ques_answer_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.answer_id
     *
     * @return the value of t_an_ques_answer_detail.answer_id
     *
     * @mbggenerated
     */
    public Long getAnswerId() {
        return answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.answer_id
     *
     * @param answerId the value for t_an_ques_answer_detail.answer_id
     *
     * @mbggenerated
     */
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.answer_name
     *
     * @return the value of t_an_ques_answer_detail.answer_name
     *
     * @mbggenerated
     */
    public String getAnswerName() {
        return answerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.answer_name
     *
     * @param answerName the value for t_an_ques_answer_detail.answer_name
     *
     * @mbggenerated
     */
    public void setAnswerName(String answerName) {
        this.answerName = answerName == null ? null : answerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.option_id
     *
     * @return the value of t_an_ques_answer_detail.option_id
     *
     * @mbggenerated
     */
    public String getOptionId() {
        return optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.option_id
     *
     * @param optionId the value for t_an_ques_answer_detail.option_id
     *
     * @mbggenerated
     */
    public void setOptionId(String optionId) {
        this.optionId = optionId == null ? null : optionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.ques_id
     *
     * @return the value of t_an_ques_answer_detail.ques_id
     *
     * @mbggenerated
     */
    public Long getQuesId() {
        return quesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.ques_id
     *
     * @param quesId the value for t_an_ques_answer_detail.ques_id
     *
     * @mbggenerated
     */
    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.ques_name
     *
     * @return the value of t_an_ques_answer_detail.ques_name
     *
     * @mbggenerated
     */
    public String getQuesName() {
        return quesName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.ques_name
     *
     * @param quesName the value for t_an_ques_answer_detail.ques_name
     *
     * @mbggenerated
     */
    public void setQuesName(String quesName) {
        this.quesName = quesName == null ? null : quesName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.ques_survey_id
     *
     * @return the value of t_an_ques_answer_detail.ques_survey_id
     *
     * @mbggenerated
     */
    public Long getQuesSurveyId() {
        return quesSurveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.ques_survey_id
     *
     * @param quesSurveyId the value for t_an_ques_answer_detail.ques_survey_id
     *
     * @mbggenerated
     */
    public void setQuesSurveyId(Long quesSurveyId) {
        this.quesSurveyId = quesSurveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.ques_type_id
     *
     * @return the value of t_an_ques_answer_detail.ques_type_id
     *
     * @mbggenerated
     */
    public Long getQuesTypeId() {
        return quesTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.ques_type_id
     *
     * @param quesTypeId the value for t_an_ques_answer_detail.ques_type_id
     *
     * @mbggenerated
     */
    public void setQuesTypeId(Long quesTypeId) {
        this.quesTypeId = quesTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.order_by_id
     *
     * @return the value of t_an_ques_answer_detail.order_by_id
     *
     * @mbggenerated
     */
    public Integer getOrderById() {
        return orderById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.order_by_id
     *
     * @param orderById the value for t_an_ques_answer_detail.order_by_id
     *
     * @mbggenerated
     */
    public void setOrderById(Integer orderById) {
        this.orderById = orderById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.is_delete
     *
     * @return the value of t_an_ques_answer_detail.is_delete
     *
     * @mbggenerated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.is_delete
     *
     * @param isDelete the value for t_an_ques_answer_detail.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.create_time
     *
     * @return the value of t_an_ques_answer_detail.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.create_time
     *
     * @param createTime the value for t_an_ques_answer_detail.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_an_ques_answer_detail.update_time
     *
     * @return the value of t_an_ques_answer_detail.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_an_ques_answer_detail.update_time
     *
     * @param updateTime the value for t_an_ques_answer_detail.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.example.demo.mapper;

import com.example.demo.model.survey.Ques;
import com.example.demo.model.survey.QuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int countByExample(QuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int deleteByExample(QuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long quesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int insert(Ques record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int insertSelective(Ques record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    List<Ques> selectByExample(QuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    Ques selectByPrimaryKey(Long quesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Ques record, @Param("example") QuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Ques record, @Param("example") QuesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Ques record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_an_ques
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Ques record);
}
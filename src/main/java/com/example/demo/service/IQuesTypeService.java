package com.example.demo.service;

import com.example.demo.model.survey.QuesType;

import java.util.List;


public interface IQuesTypeService {

    void addQuesType(QuesType type);

    List<QuesType> queryQuesTypeList(Long quesSurveyId);

    List<QuesType> queryQuesTypeList(int page, int limit);

    QuesType getById(Long quesTypeId);

    int countQuesType();

    void updateQuesType(QuesType quesType);

    List<QuesType> queryQuesTypeList(QuesType quesType);

}

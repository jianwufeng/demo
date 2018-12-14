package com.example.demo.service;

import com.example.demo.model.survey.QuesSurvey;

import java.util.List;


public interface IQuesSurveyService {

    void addQuesSurvey(QuesSurvey quesSurvey);

    List<QuesSurvey> queryQuesSurvey(int page, int limit);

    List<QuesSurvey> queyQuesSurveyByCondition(QuesSurvey quesSurvey);

    int countQuesSurvey();

    void updateByCondition(QuesSurvey quesSurvey);

    QuesSurvey getQuesSurveyById(Long quesSurveyId);
}

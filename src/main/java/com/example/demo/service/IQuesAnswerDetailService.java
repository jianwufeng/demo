package com.example.demo.service;

import com.example.demo.model.survey.Ques;
import com.example.demo.model.survey.QuesAnswerDetail;

import java.util.List;
import java.util.Map;


public interface IQuesAnswerDetailService {

    void addQuesAnswerDetail(QuesAnswerDetail aser);

    List<QuesAnswerDetail> queryQuesAnswerDetailList(Long quesSurveyId, List<Long> quesIds);

    Map<Long, List<QuesAnswerDetail>> queryQuesAnswerDetailMap(Long quesSurveyId, List<Long> quesIds);

    List<QuesAnswerDetail> queryQuesAnswerListPage(int page, int limit);

    int countQuesAnswer();

    Map<Ques, List<QuesAnswerDetail>> queryQuesAnswerDetailMapBy(Long quesSurveyId, List<Long> quesIds);

    int updateQuesAnswerDetail(QuesAnswerDetail quesAnswerDetail);

}

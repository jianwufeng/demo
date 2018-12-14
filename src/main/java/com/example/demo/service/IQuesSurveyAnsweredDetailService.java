package com.example.demo.service;

import com.example.demo.controller.dto.SurveyCompanyPerDto;
import com.example.demo.controller.dto.Top5Dto;
import com.example.demo.model.survey.QuesSurveyAnsweredDetail;

import java.util.List;
import java.util.Map;


public interface IQuesSurveyAnsweredDetailService {

    public void batchInsert(List<QuesSurveyAnsweredDetail> detailList);

    public List<Top5Dto> getAgreeTop5(Long quesSurveyId);

    public List<Top5Dto> getDisAgreeTop5(Long quesSurveyId);

    public Map<Long, Top5Dto> getPerListByAnswer(Long quesSurveyId, String answerName);

    public SurveyCompanyPerDto getPerListByCompany(Long quesSurveyId);

    public List<QuesSurveyAnsweredDetail> getAnsweredDetailList(Long quesSurveyId);

}

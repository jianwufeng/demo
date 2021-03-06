package com.example.demo.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.demo.controller.dto.SurveyCompanyPerDto;
import com.example.demo.controller.dto.Top5Dto;
import com.example.demo.mapper.QuesSurveyAnsweredDetailMapper;
import com.example.demo.model.survey.QuesSurveyAnsweredDetail;
import com.example.demo.model.survey.QuesSurveyAnsweredDetailExample;
import com.example.demo.service.IQuesSurveyAnsweredDetailService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Maps;

@Service("quesSurveyAnsweredDetailService")
public class QuesSurveyAnsweredDetailServiceImpl implements IQuesSurveyAnsweredDetailService {

    @Autowired
    private QuesSurveyAnsweredDetailMapper quesSurveyAnsweredDetailMapper;

//    @Autowired
//    private QuesSurveyAnsweredDetailExtMapper quesSurveyAnsweredDetailExtMapper;

    @Override
    public void batchInsert(List<QuesSurveyAnsweredDetail> detailList) {
        for (QuesSurveyAnsweredDetail quesSurveyAnsweredDetail : detailList) {
            quesSurveyAnsweredDetail.setCreateTime(new Date());
            quesSurveyAnsweredDetail.setUpdateTime(new Date());
            quesSurveyAnsweredDetailMapper.insertSelective(quesSurveyAnsweredDetail);
        }
    }

    @Override
    public List<Top5Dto> getAgreeTop5(Long quesSurveyId) {
        return null;
    }

    @Override
    public List<Top5Dto> getDisAgreeTop5(Long quesSurveyId) {
        return null;
    }

    @Override
    public Map<Long, Top5Dto> getPerListByAnswer(Long quesSurveyId, String answerName) {
        return null;
    }

    @Override
    public SurveyCompanyPerDto getPerListByCompany(Long quesSurveyId) {
        return null;
    }

    @Override
    public List<QuesSurveyAnsweredDetail> getAnsweredDetailList(Long quesSurveyId) {
        return null;
    }

    /*@Override
    public List<Top5Dto> getAgreeTop5(Long quesSurveyId) {
        PageHelper.startPage(1, 5, false);
        return quesSurveyAnsweredDetailExtMapper.getAgreeTop5(quesSurveyId);
    }

    @Override
    public List<Top5Dto> getDisAgreeTop5(Long quesSurveyId) {
        PageHelper.startPage(1, 5, false);
        return quesSurveyAnsweredDetailExtMapper.getDisAgreeTop5(quesSurveyId);
    }

    @Override
    public Map<Long, Top5Dto> getPerListByAnswer(Long quesSurveyId, String answerName) {
        Map<Long, Top5Dto> resultMap = Maps.newHashMap();
        List<Top5Dto> list = quesSurveyAnsweredDetailExtMapper.getPerListByAnswer(quesSurveyId, answerName);
        if (CollectionUtils.isNotEmpty(list)) {
            for (Top5Dto top5Dto : list) {
                resultMap.put(top5Dto.getQuesTypeId(), top5Dto);
            }
        }
        return resultMap;
    }

    @Override
    public SurveyCompanyPerDto getPerListByCompany(Long quesSurveyId) {
        return quesSurveyAnsweredDetailExtMapper.getPerListByCompany(quesSurveyId);
    }

    @Override
    public List<QuesSurveyAnsweredDetail> getAnsweredDetailList(Long quesSurveyId) {
        QuesSurveyAnsweredDetailExample example = new QuesSurveyAnsweredDetailExample();
        example.setOrderByClause("ques_type_id asc,ques_id asc");
        example.createCriteria().andQuesSurveyIdEqualTo(quesSurveyId);
        return quesSurveyAnsweredDetailExtMapper.selectByExample(example);
    }*/
}

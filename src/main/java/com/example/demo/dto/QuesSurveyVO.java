package com.example.demo.dto;

import com.example.demo.model.survey.QuesSurvey;

import java.io.Serializable;
import java.util.List;


public class QuesSurveyVO extends QuesSurvey implements Serializable {

    /**
     */
    private static final long serialVersionUID = -4236340934680006299L;

    private List<QuesTypeVO>  quesTypeList;

    public List<QuesTypeVO> getQuesTypeList() {
        return quesTypeList;
    }

    public void setQuesTypeList(List<QuesTypeVO> quesTypeList) {
        this.quesTypeList = quesTypeList;
    }

}

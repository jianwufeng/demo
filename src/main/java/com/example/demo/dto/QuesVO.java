package com.example.demo.dto;

import com.example.demo.model.survey.Ques;
import com.example.demo.model.survey.QuesAnswerDetail;

import java.io.Serializable;
import java.util.List;


public class QuesVO extends Ques implements Serializable {

    /**
     */
    private static final long      serialVersionUID = 5434988852090588348L;

    private List<QuesAnswerDetail> quesAnswerDetailList;;

    public List<QuesAnswerDetail> getQuesAnswerDetailList() {
        return quesAnswerDetailList;
    }

    public void setQuesAnswerDetailList(List<QuesAnswerDetail> quesAnswerDetailList) {
        this.quesAnswerDetailList = quesAnswerDetailList;
    }

}

package com.example.demo.controller.dto;

import com.example.demo.model.survey.Ques;
import com.example.demo.model.survey.QuesAnswerDetail;

import java.util.List;


public class QuesDto {

    private Ques ques;

    private List<QuesAnswerDetail> quesAnswerDetailList;

    public Ques getQues() {
        return ques;
    }

    public void setQues(Ques ques) {
        this.ques = ques;
    }

    public List<QuesAnswerDetail> getQuesAnswerDetailList() {
        return quesAnswerDetailList;
    }

    public void setQuesAnswerDetailList(List<QuesAnswerDetail> quesAnswerDetailList) {
        this.quesAnswerDetailList = quesAnswerDetailList;
    }

}

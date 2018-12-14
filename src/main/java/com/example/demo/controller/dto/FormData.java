package com.example.demo.controller.dto;

import com.example.demo.model.survey.Ques;
import com.example.demo.model.survey.QuesAnswerDetail;
import com.example.demo.model.survey.QuesSurvey;
import com.example.demo.model.survey.QuesType;

import java.util.List;

public class FormData {

    private QuesType quesType;

    private QuesSurvey quesSurvey;

    private Ques ques;

    private List<QuesAnswerDetail> quesAnswerDetailList;

    public QuesType getQuesType() {
        return quesType;
    }

    public void setQuesType(QuesType quesType) {
        this.quesType = quesType;
    }

    public QuesSurvey getQuesSurvey() {
        return quesSurvey;
    }

    public void setQuesSurvey(QuesSurvey quesSurvey) {
        this.quesSurvey = quesSurvey;
    }

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

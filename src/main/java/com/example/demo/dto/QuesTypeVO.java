package com.example.demo.dto;

import com.example.demo.model.survey.QuesType;

import java.io.Serializable;
import java.util.List;


public class QuesTypeVO extends QuesType implements Serializable {

    /**
     */
    private static final long serialVersionUID = -4236340934680006299L;

    private List<QuesVO>      quesList;

    public List<QuesVO> getQuesList() {
        return quesList;
    }

    public void setQuesList(List<QuesVO> quesList) {
        this.quesList = quesList;
    }

}

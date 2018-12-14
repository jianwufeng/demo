package com.example.demo.controller.dto;


import com.example.demo.model.survey.QuesSurvey;

public class QuesSurveyDto extends QuesSurvey {
    /**
     */
    private static final long serialVersionUID = 1761717258842973393L;
    private String            file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}

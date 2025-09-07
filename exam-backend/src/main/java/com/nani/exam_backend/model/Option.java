package com.nani.exam_backend.model;

import lombok.Data;

@Data
public class Option {
    private String id;
    private String questionId;
    private String text;
    private Boolean isCorrect;
    private String explanation;
    private String mediaUrl;
    private String optionType;
}

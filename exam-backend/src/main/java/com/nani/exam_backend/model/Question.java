package com.nani.exam_backend.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
    private Long id;
    private Long topicId;
    private String questionType; // MCQ, TRUE_FALSE, etc.
    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOptions;
    private String explanation;
    private String difficulty;
    private Boolean active;
    private String tags;
}

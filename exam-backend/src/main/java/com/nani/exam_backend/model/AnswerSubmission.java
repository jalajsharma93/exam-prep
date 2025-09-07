package com.nani.exam_backend.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AnswerSubmission {
    private String id;
    private String userId;
    private String questionId;
    private Long selectedOptionId;
    private String descriptiveAnswer;
    private Boolean isCorrect;
    private LocalDateTime submittedAt;

    // Getters and setters
}

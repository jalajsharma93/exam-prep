package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
public class ExamSession {
    private Long id;
    private String userId;
    private String certificateId;
    private Integer totalQuestions;
    private Integer correctAnswers;
    private Integer score;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

    // Getters and setters
}

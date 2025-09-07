package com.nani.exam_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "answer_submission")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerSubmissionEntity {
    @Id
    @Column(name = "answer_submission_id", nullable = false, updatable = false)
    private String answerSubmissionId;


    @Column(nullable = false)
    private String questionId;


    @Column(nullable = false)
    private String userId;


    @Column(nullable = false)
    private String submittedAnswer;


    private Boolean isCorrect;


    private String explanation;


    private LocalDateTime submittedAt = LocalDateTime.now();
}

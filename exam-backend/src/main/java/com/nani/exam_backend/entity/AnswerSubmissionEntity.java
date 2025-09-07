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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private Long questionId;


    @Column(nullable = false)
    private String userId;


    @Column(nullable = false)
    private String submittedAnswer;


    private Boolean isCorrect;


    private String explanation;


    private LocalDateTime submittedAt = LocalDateTime.now();
}

package com.nani.exam_backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "exam_session")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamSessionEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String userId;


    @Column(nullable = false)
    private Long certificateId;


    private LocalDateTime startedAt = LocalDateTime.now();
    private LocalDateTime endedAt;
    private Integer totalQuestions;
    private Integer correctAnswers;
    private Integer timeTakenSeconds;


// Getters and Setters
}
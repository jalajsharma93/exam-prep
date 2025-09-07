package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Data
public class Feedback {
    private Long id;
    private String userId;
    private String message;
    private Integer rating;
    private LocalDateTime submittedAt;

    // Getters and setters
}

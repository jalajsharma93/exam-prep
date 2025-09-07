package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class DifficultyLevel {
    private Long id;
    private String level;  // e.g., EASY, MEDIUM, HARD
    private String description;

    // Getters and setters
}

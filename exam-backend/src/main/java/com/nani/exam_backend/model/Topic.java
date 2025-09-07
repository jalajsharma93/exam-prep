package com.nani.exam_backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Topic {

    private Long id;
    private Long certificateId;
    private String name;
    private String description;
    private Boolean active;
    private Integer orderIndex;
    private Integer estimatedTime;
    private String slug;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
}

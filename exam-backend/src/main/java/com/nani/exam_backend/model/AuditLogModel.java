package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Data
public class AuditLogModel {
    private Long id;
    private String userId;
    private String action;
    private String target;
    private LocalDateTime timestamp;

    // Getters and setters
}

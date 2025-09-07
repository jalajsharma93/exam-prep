package com.nani.exam_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "certificate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CertificateEntity {

    @Id
    private String certificateId;

    private String name;

    @Column(name = "exam_duration")
    private Integer examDuration;

    @Column(name = "passing_score")
    private Integer passingScore;

    @Column(name = "num_questions")
    private Integer numQuestions;

    private Boolean active;

    @Column(name = "created_at", updatable = false, insertable = false)
    private Timestamp createdAt;

    @Column (name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "updated_at", insertable = false)
    private Timestamp updatedAt;
}

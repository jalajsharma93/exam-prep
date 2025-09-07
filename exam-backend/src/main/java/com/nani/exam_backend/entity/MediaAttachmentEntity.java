package com.nani.exam_backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "media_attachment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MediaAttachmentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long questionId;
    private String mediaType;
    private String url;
    private String description;
    private LocalDateTime createdAt = LocalDateTime.now();


// Getters and Setters
}
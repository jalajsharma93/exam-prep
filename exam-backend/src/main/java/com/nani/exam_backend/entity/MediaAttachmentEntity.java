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
    private String media_attachment_id;


    private String questionId;
    private String mediaType;
    private String url;
    private String description;
    private LocalDateTime createdAt = LocalDateTime.now();


// Getters and Setters
}
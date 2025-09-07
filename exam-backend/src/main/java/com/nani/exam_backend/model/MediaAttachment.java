package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MediaAttachment {
    private Long id;
    private Long questionId;
    private String mediaType;
    private String mediaUrl;
    private String description;

    // Getters and setters
}

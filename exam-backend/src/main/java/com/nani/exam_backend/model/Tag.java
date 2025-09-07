package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Tag {
    private Long id;
    private String name;
    private String slug;

    // Getters and setters
}

package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class QuestionTag {
        private Long id;
        private String questionId;
        private Long tagId;

        // Getters and setters

}

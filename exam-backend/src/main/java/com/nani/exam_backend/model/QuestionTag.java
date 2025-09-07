package com.nani.exam_backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class QuestionTag {
        private Long id;
        private Long questionId;
        private Long tagId;

        // Getters and setters

}

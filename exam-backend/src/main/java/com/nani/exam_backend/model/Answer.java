package com.nani.exam_backend.model;

import com.nani.exam_backend.entity.OptionEntity;
import com.nani.exam_backend.entity.QuestionEntity;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Answer {

    private Long id;
    private QuestionEntity question;
    private String userId; // changed from UserAccountEntity to String
    private OptionEntity option;
    private String textAnswer;
    private Boolean isCorrect;
    private LocalDateTime submittedAt;
}

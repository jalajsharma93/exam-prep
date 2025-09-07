package com.nani.exam_backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "question_tag")
@Data

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionTagEntity {


    @Id
    private String id;
    private String questionId;
    private String tagId;

}
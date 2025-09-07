package com.nani.exam_backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "question_tag")
@Data
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionTagEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long questionId;
    private Long tagId;

}
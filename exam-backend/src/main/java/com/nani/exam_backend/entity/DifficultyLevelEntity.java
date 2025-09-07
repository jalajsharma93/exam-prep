package com.nani.exam_backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "difficulty_level")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DifficultyLevelEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String level;
    private String description;


// Getters and Setters
}
package com.nani.exam_backend.enums;

public enum UserRole {
    PARTICIPANT,     // General user who takes exams
    PROCTOR,         // Oversees exam sessions
    ADMIN,           // Has full control over platform
    DEVELOPER,       // Manages technical backend/frontend
    MANAGEMENT,      // Stakeholder or senior-level access
    EDITOR,// Can add/edit questions and content
    REVIEWER,       // Reviews content and questions
    AUDITOR,         // Monitors activities and ensures complianc
    MODERATOR        // Manages user interactions and content
}

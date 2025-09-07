package com.nani.examprep.model;

import com.nani.exam_backend.enums.UserRole;
import lombok.Data;

@Data
public class UserAccount {
    private Long id;
    private String name;
    private String email;
    private UserRole role;
    private Boolean active;
}

package com.nani.exam_backend.mapper;

import com.nani.exam_backend.entity.CertificateEntity;
import com.nani.exam_backend.model.Certificate;

public class CertificateMapper {

    public static CertificateEntity toEntity(Certificate model) {
        return CertificateEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .description(model.getDescription())
                .isActive(model.isActive())
                .createdAt(model.getCreatedAt())
                .updatedAt(model.getUpdatedAt())
                .build();
    }

    public static Certificate toModel(CertificateEntity entity) {
        return Certificate.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .isActive(entity.isActive())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}

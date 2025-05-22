package com.kpilszak.thegastrogeekbackend.application.dto.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractResponseDTO {
    private String createdBy;
    private Instant createdDate;
    private String updatedBy;
    private Instant updatedDate;
    private Long version;
}

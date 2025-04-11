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
public abstract class AbstractDTO {
    private String createdBy;
    private String updatedBy;
    private Instant createdDate;
    private Instant updatedDate;
    private Long version;
}

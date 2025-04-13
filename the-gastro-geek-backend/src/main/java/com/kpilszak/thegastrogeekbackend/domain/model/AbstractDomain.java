package com.kpilszak.thegastrogeekbackend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractDomain {
    private String createdBy;
    private String updatedBy;
    private Instant createdDate;
    private Instant updatedDate;
    private Long version;
}

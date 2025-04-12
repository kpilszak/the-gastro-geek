package com.kpilszak.thegastrogeekbackend.domain.model;

import lombok.Data;

import java.time.Instant;

@Data
public abstract class AbstractDomain {
    private String createdBy;
    private String updatedBy;
    private Instant createdDate;
    private Instant updatedDate;
    private Long version;
}

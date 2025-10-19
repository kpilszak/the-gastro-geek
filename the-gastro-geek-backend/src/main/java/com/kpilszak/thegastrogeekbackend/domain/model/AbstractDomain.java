package com.kpilszak.thegastrogeekbackend.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractDomain {
    @EqualsAndHashCode.Include
    private Long id;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    private Long version;
}


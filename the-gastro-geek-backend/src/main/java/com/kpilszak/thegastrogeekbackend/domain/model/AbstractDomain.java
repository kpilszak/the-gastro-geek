package com.kpilszak.thegastrogeekbackend.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class AbstractDomain {
    @EqualsAndHashCode.Include
    private Long id;
    private String createdBy;
    private Instant createdDate;
    private String lastModifiedBy;
    private Instant lastUpdatedDate;
    private Long version;
}


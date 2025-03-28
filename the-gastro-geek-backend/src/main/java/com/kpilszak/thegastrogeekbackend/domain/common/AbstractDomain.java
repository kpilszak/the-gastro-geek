package com.kpilszak.thegastrogeekbackend.domain.common;

import java.time.Instant;

public abstract class AbstractDomain {
    private String createdBy;
    private String updatedBy;
    private Instant createdDate;
    private Instant updatedDate;
    private Long version;
}

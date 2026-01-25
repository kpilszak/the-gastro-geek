package com.kpilszak.thegastrogeekbackend.infrastructure.persistence;

public interface BaseValidationRepository<MI> {
    boolean exists(MI id);
}

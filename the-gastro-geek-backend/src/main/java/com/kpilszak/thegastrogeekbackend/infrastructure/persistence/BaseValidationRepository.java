package com.kpilszak.thegastrogeekbackend.infrastructure.persistence;

public interface BaseValidationRepository<DI> {
    boolean exists(DI id);
}

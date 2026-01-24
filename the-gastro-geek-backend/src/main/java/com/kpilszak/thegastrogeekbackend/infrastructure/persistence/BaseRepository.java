package com.kpilszak.thegastrogeekbackend.infrastructure.persistence;

public interface BaseRepository<M, MI> extends BaseValidationRepository<MI> {
    M save(M model);
}

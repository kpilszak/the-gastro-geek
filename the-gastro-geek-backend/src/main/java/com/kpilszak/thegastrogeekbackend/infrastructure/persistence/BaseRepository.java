package com.kpilszak.thegastrogeekbackend.infrastructure.persistence;

public interface BaseRepository<M, DI> extends BaseValidationRepository<DI> {
    M save(M domain);
}

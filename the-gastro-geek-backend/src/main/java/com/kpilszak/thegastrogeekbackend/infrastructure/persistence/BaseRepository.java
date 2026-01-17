package com.kpilszak.thegastrogeekbackend.infrastructure.persistence;

public interface BaseRepository<D, DI> extends BaseValidationRepository<DI> {
    D save(D domain);
}

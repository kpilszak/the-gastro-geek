package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

public interface EntityMapper<D, E> {
    D fromEntity(E entity);

    E toEntity(D domain);
}

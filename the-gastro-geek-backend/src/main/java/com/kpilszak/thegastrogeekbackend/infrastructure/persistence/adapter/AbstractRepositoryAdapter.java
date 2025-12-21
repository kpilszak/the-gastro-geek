package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository.BaseJpaRepository;

public abstract class AbstractRepositoryAdapter<D, E, EI> {
    protected final BaseJpaRepository<E, EI> repository;

    protected AbstractRepositoryAdapter(
            BaseJpaRepository<E, EI> repository
    ) {
        this.repository = repository;
    }
}

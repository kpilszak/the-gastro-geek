package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseJpaRepository<E, EI> extends JpaRepository<E, EI> {
}

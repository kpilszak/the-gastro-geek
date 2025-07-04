package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository;

import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe.RecipeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeJpaRepository extends PagingAndSortingRepository<RecipeEntity, Long> {
}

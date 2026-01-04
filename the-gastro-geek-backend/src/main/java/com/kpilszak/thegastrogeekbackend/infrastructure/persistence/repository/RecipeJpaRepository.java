package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository;

import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe.RecipeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeJpaRepository extends BaseJpaRepository<RecipeEntity, Long> {
}

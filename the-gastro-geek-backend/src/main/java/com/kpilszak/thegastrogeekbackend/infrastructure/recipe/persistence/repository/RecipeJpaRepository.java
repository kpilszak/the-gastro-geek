package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.repository;

import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeJpaRepository extends JpaRepository<RecipeEntity, Long> {
}

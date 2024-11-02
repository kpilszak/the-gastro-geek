package com.kpilszak.thegastrogeekbackend.recipes.repository;

import com.kpilszak.thegastrogeekbackend.domain.recipe.model.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    Page<Recipe> findAll(Pageable pageable);
}

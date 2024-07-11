package com.kpilszak.thegastrogeekbackend.recipes.repository;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}

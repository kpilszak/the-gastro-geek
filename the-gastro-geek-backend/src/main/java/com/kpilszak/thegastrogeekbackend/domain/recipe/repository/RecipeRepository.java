package com.kpilszak.thegastrogeekbackend.domain.recipe.repository;

import com.kpilszak.thegastrogeekbackend.domain.recipe.model.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeRepository {
    Page<Recipe> findAll(Pageable pageable);
}

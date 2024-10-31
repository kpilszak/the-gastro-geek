package com.kpilszak.thegastrogeekbackend.application.recipe;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeService {
    Page<Recipe> getAllRecipes(Pageable pageable);
}

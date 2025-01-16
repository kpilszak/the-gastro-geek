package com.kpilszak.thegastrogeekbackend.application.recipe;

import com.kpilszak.thegastrogeekbackend.domain.model.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeService {
    Page<Recipe> getAllRecipes(Pageable pageable);
}

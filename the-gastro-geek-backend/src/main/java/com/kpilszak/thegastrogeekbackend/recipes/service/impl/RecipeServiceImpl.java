package com.kpilszak.thegastrogeekbackend.recipes.service.impl;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;
import com.kpilszak.thegastrogeekbackend.recipes.repository.RecipeRepository;
import com.kpilszak.thegastrogeekbackend.recipes.service.RecipeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(
            final RecipeRepository recipeRepository
    ) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Page<Recipe> getAllRecipes(Pageable pageable) {
        return recipeRepository.findAll(pageable);
    }

}

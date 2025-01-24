package com.kpilszak.thegastrogeekbackend.domain.service;

import com.kpilszak.thegastrogeekbackend.application.RecipeService;
import com.kpilszak.thegastrogeekbackend.domain.model.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.repository.RecipeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Page<Recipe> getAllRecipes(Pageable pageable) {
        return recipeRepository.findAll(pageable);
    }
}

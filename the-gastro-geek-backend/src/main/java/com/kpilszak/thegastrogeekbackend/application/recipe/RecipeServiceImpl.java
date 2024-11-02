package com.kpilszak.thegastrogeekbackend.application.recipe;

import com.kpilszak.thegastrogeekbackend.domain.recipe.model.Recipe;
import com.kpilszak.thegastrogeekbackend.recipes.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    @Override
    public Page<Recipe> getAllRecipes(Pageable pageable) {
        return recipeRepository.findAll(pageable);
    }
}

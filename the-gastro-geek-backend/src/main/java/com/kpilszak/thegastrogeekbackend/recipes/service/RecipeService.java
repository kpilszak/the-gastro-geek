package com.kpilszak.thegastrogeekbackend.recipes.service;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;

import java.util.List;

public interface RecipeService {

    List<Recipe> getAllRecipes();
}

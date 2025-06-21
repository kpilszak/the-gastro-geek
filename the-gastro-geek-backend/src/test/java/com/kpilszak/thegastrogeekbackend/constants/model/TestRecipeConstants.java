package com.kpilszak.thegastrogeekbackend.constants.model;

import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe.RecipeEntity;
import org.instancio.Instancio;
import org.instancio.Model;

public class TestRecipeConstants {
    public static final Model<Recipe> RECIPE_MODEL = Instancio.of(Recipe.class).toModel();
    public static final Model<RecipeRequestDTO> RECIPE_REQUEST_DTO_MODEL = Instancio.of(RecipeRequestDTO.class).toModel();
    public static final Model<RecipeEntity> RECIPE_ENTITY_MODEL = Instancio.of(RecipeEntity.class).toModel();
}

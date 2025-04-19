package com.kpilszak.thegastrogeekbackend.constants.model;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import org.instancio.Instancio;
import org.instancio.Model;

public class TestRecipeConstants {
    public static final Model<Recipe> RECIPE_MODEL = Instancio.of(Recipe.class).toModel();
}

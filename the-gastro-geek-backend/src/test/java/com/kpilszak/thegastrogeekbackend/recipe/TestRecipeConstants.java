package com.kpilszak.thegastrogeekbackend.recipe;

import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.entity.recipe.RecipeEntity;
import org.instancio.Instancio;
import org.instancio.Model;

public class TestRecipeConstants {
    public static Model<RecipeEntity> RECIPE_MODEL = Instancio.of(RecipeEntity.class)
//            .supply(field(Recipe::getCalories), gen -> gen.ints().range(100, 1000))
            .toModel();
}

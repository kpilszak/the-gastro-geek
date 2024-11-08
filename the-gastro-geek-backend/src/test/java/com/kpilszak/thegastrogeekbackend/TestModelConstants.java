package com.kpilszak.thegastrogeekbackend;

import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.entity.RecipeEntity;
import org.instancio.Instancio;
import org.instancio.Model;

public class TestModelConstants {

    public static Model<RecipeEntity> RECIPE_MODEL = Instancio.of(RecipeEntity.class)
//            .supply(field(Recipe::getCalories), gen -> gen.ints().range(100, 1000))
            .toModel();
}

package com.kpilszak.thegastrogeekbackend;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;
import org.instancio.Instancio;
import org.instancio.Model;

import static org.instancio.Bindings.field;

public class TestModelConstants {

    public static Model<Recipe> RECIPE_MODEL = Instancio.of(Recipe.class)
            .supply(field(Recipe::getCalories), gen -> gen.ints().range(100, 1000))
            .toModel();
}

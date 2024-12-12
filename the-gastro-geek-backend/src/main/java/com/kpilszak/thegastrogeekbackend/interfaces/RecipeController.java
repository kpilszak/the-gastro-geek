package com.kpilszak.thegastrogeekbackend.interfaces;

import com.kpilszak.thegastrogeekbackend.application.recipe.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;
}

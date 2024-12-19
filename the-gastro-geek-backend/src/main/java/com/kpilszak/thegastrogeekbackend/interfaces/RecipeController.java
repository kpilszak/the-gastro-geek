package com.kpilszak.thegastrogeekbackend.interfaces;

import com.kpilszak.thegastrogeekbackend.application.recipe.RecipeService;
import com.kpilszak.thegastrogeekbackend.application.recipe.dto.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper.RecipeMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;
    private final RecipeMapper recipeMapper;

    public RecipeController(RecipeService recipeService, RecipeMapper recipeMapper) {
        this.recipeService = recipeService;
        this.recipeMapper = recipeMapper;
    }

    @GetMapping
    public Page<RecipeResponseDTO> getAllRecipes(Pageable pageable) {
        return recipeMapper.toDTOPage(recipeService.getAllRecipes(pageable));
    }
}

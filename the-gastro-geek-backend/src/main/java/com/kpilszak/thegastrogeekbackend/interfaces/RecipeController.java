package com.kpilszak.thegastrogeekbackend.interfaces;

import com.kpilszak.thegastrogeekbackend.application.RecipeManagement;
import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper.RecipeMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeManagement recipeManagement;
    private final RecipeMapper recipeMapper;

    public RecipeController(RecipeManagement recipeManagement, RecipeMapper recipeMapper) {
        this.recipeManagement = recipeManagement;
        this.recipeMapper = recipeMapper;
    }

    @GetMapping
    public Page<RecipeResponseDTO> getAllRecipes(Pageable pageable) {
        return recipeMapper.toDTOPage(recipeManagement.getAllRecipes(pageable));
    }
}

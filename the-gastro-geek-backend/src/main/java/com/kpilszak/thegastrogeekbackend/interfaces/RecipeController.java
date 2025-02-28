package com.kpilszak.thegastrogeekbackend.interfaces;

import com.kpilszak.thegastrogeekbackend.application.RecipeManagement;
import com.kpilszak.thegastrogeekbackend.application.dto.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper.RecipeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeManagement recipeManagement;
    private final RecipeMapper recipeMapper;

    @GetMapping
    public Page<RecipeResponseDTO> getAllRecipes(Pageable pageable) {
        return recipeMapper.toDTOPage(recipeManagement.getAll(pageable));
    }
}

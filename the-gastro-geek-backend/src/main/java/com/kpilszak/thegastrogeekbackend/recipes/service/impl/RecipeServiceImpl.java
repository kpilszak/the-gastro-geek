package com.kpilszak.thegastrogeekbackend.recipes.service.impl;

import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.recipes.repository.RecipeRepository;
import com.kpilszak.thegastrogeekbackend.recipes.service.RecipeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(
            RecipeRepository recipeRepository
    ) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Page<RecipeResponseDTO> getAllRecipes(Pageable pageable) {
        return null;
    }

}

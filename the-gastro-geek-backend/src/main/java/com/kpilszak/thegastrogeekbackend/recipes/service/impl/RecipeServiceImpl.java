package com.kpilszak.thegastrogeekbackend.recipes.service.impl;

import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.recipes.service.RecipeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Override
    public Page<RecipeResponseDTO> getAllRecipes(Pageable pageable) {
        return null;
    }

}

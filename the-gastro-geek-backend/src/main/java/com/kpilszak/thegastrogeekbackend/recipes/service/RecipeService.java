package com.kpilszak.thegastrogeekbackend.recipes.service;

import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeService {

    Page<RecipeResponseDTO> getAllRecipes(Pageable pageable);

}

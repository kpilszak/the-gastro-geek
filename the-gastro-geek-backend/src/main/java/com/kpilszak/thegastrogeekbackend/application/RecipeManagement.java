package com.kpilszak.thegastrogeekbackend.application;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeManagement {
    private final RecipeService service;

    public Page<Recipe> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }
}

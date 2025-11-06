package com.kpilszak.thegastrogeekbackend.domain.service;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository repository;

    public Page<Recipe> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}

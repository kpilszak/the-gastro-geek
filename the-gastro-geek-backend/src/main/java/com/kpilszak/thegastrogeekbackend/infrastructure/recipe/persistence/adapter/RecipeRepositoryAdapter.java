package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.domain.model.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.recipe.repository.RecipeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class RecipeRepositoryAdapter implements RecipeRepository {
    @Override
    public Page<Recipe> findAll(Pageable pageable) {
        return null;
    }
}

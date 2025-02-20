package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.domain.model.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.repository.RecipeRepository;
import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper.RecipeMapper;
import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.repository.RecipeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecipeRepositoryAdapter implements RecipeRepository {
    private final RecipeJpaRepository repository;
    private final RecipeMapper mapper;

    @Override
    public Page<Recipe> findAll(Pageable pageable) {
        return null;
    }
}

package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.repository.RecipeRepository;
import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository.RecipeJpaRepository;
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
        return mapper.fromEntities(repository.findAll(pageable));
    }
}

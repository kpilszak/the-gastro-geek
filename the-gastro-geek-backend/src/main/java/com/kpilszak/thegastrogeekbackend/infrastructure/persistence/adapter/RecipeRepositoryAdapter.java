package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.domain.model.PagingRequest;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.RecipeQueryResponse;
import com.kpilszak.thegastrogeekbackend.domain.repository.RecipeRepository;
import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository.RecipeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecipeRepositoryAdapter implements RecipeRepository {
    private final RecipeJpaRepository repository;
    private final RecipeMapper mapper;

    @Override
    public RecipeQueryResponse findAllWithQuery(String query, PagingRequest pagingRequest) {
        return new RecipeQueryResponse(repository.findAll(pagingRequest));
    }
}

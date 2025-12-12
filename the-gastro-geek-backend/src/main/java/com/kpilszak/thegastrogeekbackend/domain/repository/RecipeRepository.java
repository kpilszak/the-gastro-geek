package com.kpilszak.thegastrogeekbackend.domain.repository;

import com.kpilszak.thegastrogeekbackend.domain.model.PagingRequest;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.RecipeQueryResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository {
    RecipeQueryResponse findAllWithQuery(String query, PagingRequest pagingRequest);
}

package com.kpilszak.thegastrogeekbackend.domain.repository;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.RecipeQueryResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository {
    RecipeQueryResponse findAllWithQuery(String query, Pageable pageable);
}

package com.kpilszak.thegastrogeekbackend.domain.repository;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.RecipeQueryResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeRepository {
    RecipeQueryResponse findAllWithQuery(String query, Pageable pageable);
}

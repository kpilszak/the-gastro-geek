package com.kpilszak.thegastrogeekbackend.application;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.RecipeQueryResponse;
import com.kpilszak.thegastrogeekbackend.domain.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeManagement {
    private final RecipeService service;

    public RecipeQueryResponse getPagedWithQuery(String query, Pageable pageable) {
        return service.getPagedWithQuery(query, pageable);
    }
}

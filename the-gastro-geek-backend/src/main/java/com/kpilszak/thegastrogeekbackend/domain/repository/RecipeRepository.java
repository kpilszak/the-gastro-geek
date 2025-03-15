package com.kpilszak.thegastrogeekbackend.domain.repository;

import com.kpilszak.thegastrogeekbackend.infrastructure.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeRepository {
    Page<Recipe> findAll(Pageable pageable);
}

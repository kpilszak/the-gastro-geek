package com.kpilszak.thegastrogeekbackend.domain.repository;

import com.kpilszak.thegastrogeekbackend.domain.model.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecipeRepository {
    Page<Recipe> findAll(Pageable pageable);
}

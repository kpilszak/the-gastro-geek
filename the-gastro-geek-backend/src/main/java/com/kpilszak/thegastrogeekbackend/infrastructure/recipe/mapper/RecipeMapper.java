package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper;

import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.entity.RecipeEntity;
import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {
    RecipeEntity toDomain(RecipeRequestDTO dto);

    RecipeResponseDTO toDTO(RecipeEntity recipeEntity);
}

package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper;

import com.kpilszak.thegastrogeekbackend.application.recipe.dto.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.application.recipe.dto.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.recipe.model.Recipe;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {
    Recipe fromDTO(RecipeRequestDTO dto);

    RecipeResponseDTO toDTO(Recipe domain);
}

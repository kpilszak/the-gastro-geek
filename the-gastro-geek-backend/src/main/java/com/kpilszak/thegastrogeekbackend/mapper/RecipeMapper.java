package com.kpilszak.thegastrogeekbackend.mapper;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;
import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    Recipe toDomain(RecipeRequestDTO dto);

    RecipeResponseDTO toDTO(Recipe recipe);

}

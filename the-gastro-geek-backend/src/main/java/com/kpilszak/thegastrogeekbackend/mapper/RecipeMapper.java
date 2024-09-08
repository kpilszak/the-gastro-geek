package com.kpilszak.thegastrogeekbackend.mapper;

import com.kpilszak.thegastrogeekbackend.recipes.domain.Recipe;
import com.kpilszak.thegastrogeekbackend.recipes.dto.RecipeRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    Recipe toDomain(RecipeRequestDTO dto);

}

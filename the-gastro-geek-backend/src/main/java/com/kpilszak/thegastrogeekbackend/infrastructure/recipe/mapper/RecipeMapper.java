package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper;

import com.kpilszak.thegastrogeekbackend.application.recipe.dto.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.application.recipe.dto.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.recipe.model.Recipe;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {
    Recipe fromDTO(RecipeRequestDTO dto);

    RecipeResponseDTO toDTO(Recipe domain);

    default Page<RecipeResponseDTO> toDTOPage(Page<Recipe> page) {
        List<RecipeResponseDTO> dtoList = page.getContent().stream()
                .map(this::toDTO)
                .toList();
        return null;
    }
}

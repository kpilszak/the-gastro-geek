package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe.RecipeEntity;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

@Mapper
public interface RecipeMapper {
    Recipe fromDTO(RecipeRequestDTO dto);

    RecipeResponseDTO toDTO(Recipe domain);

    default Page<RecipeResponseDTO> toDTOs(Page<Recipe> page) {
        var dtoList = page.getContent().stream()
                .map(this::toDTO)
                .toList();
        return new PageImpl<>(dtoList, page.getPageable(), page.getTotalElements());
    }

    RecipeEntity toEntity(Recipe domain);

    Recipe fromEntity(RecipeEntity entity);

    default Page<Recipe> fromEntities(Page<RecipeEntity> entityPage) {
        var domainList = entityPage.getContent().stream()
                .map(this::fromEntity)
                .toList();
        return new PageImpl<>(domainList, entityPage.getPageable(), entityPage.getTotalElements());
    }
}

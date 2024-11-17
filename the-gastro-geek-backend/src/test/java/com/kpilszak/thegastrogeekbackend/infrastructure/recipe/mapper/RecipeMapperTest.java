package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecipeMapperTest {

    @Autowired
    private RecipeMapper recipeMapper;

    @Test
    void toDomain_shouldMapRequestDTOToDomain_whenGivenValidDTO() {}

    @Test
    void toDTO_shouldMapDomainToResponseDTO_whenGivenValidDomain() {}

}
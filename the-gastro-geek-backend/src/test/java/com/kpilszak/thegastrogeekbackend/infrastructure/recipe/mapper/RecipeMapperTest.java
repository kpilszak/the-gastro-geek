package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.kpilszak.thegastrogeekbackend.constants.model.TestRecipeConstants.RECIPE_REQUEST_DTO;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class RecipeMapperTest {
    @Autowired
    private RecipeMapper mapper;

    @Test
    void fromDTO_shouldMapToDomain_whenDTOUsed() {
        var dto = Instancio.create(RECIPE_REQUEST_DTO);

        var domain = mapper.fromDTO(dto);

        assertFromDTORecipe(domain, dto);
    }

    private static void assertFromDTORecipe(Recipe domain, RecipeRequestDTO dto) {
        assertThat(domain.getId(), is(dto.getId()));
        assertThat(domain.getTitle(), is(dto.getTitle()));
        assertThat(domain.getDescription(), is(dto.getDescription()));
        assertThat(domain.getCalories(), is(dto.getCalories()));
    }
}
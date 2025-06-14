package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.entity.recipe.RecipeEntity;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import static com.kpilszak.thegastrogeekbackend.constants.model.TestRecipeConstants.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class RecipeMapperTest extends AbstractMapperTest {
    @Autowired
    private RecipeMapper mapper;

    @Test
    void fromDTO_shouldMapToDomain_whenDTOUsed() {
        var dto = Instancio.create(RECIPE_REQUEST_DTO_MODEL);

        var domain = mapper.fromDTO(dto);

        assertRecipeFromDTO(domain, dto);
    }

    @Test
    void toDTO_shouldMapToDTO_whenDomainUsed() {
        var domain = Instancio.create(RECIPE_MODEL);

        var dto = mapper.toDTO(domain);

        assertRecipeToDTO(dto, domain);
    }

    @Test
    void toDTOs_shouldMapToDTOs_whenPageUsed() {
        var list = Instancio.ofList(RECIPE_MODEL).size(1).create();
        var pageable = PageRequest.of(0, 2);
        var page = new PageImpl<>(list, pageable, list.size());

        var dto = mapper.toDTOs(page);

        assertRecipeToDTO(dto.getContent().get(0), page.getContent().get(0));
        assertPageMetadataToDTO(dto, page);
    }

    @Test
    void fromEntity_shouldMapToDomain_whenEntityUsed() {
        var entity = Instancio.create(RECIPE_ENTITY_MODEL);

        var domain = mapper.fromEntity(entity);

        assertRecipeFromEntity(domain, entity);
    }

    private static void assertRecipeFromDTO(Recipe domain, RecipeRequestDTO dto) {
        assertThat(domain.getId(), is(dto.getId()));
        assertThat(domain.getTitle(), is(dto.getTitle()));
        assertThat(domain.getDescription(), is(dto.getDescription()));
        assertThat(domain.getCalories(), is(dto.getCalories()));
    }

    private static void assertRecipeToDTO(RecipeResponseDTO dto, Recipe domain) {
        assertThat(dto.getId(), is(domain.getId()));
        assertThat(dto.getTitle(), is(domain.getTitle()));
        assertThat(dto.getDescription(), is(domain.getDescription()));
        assertThat(dto.getCalories(), is(domain.getCalories()));
        assertAuditToDTO(dto, domain);
    }

    private static void assertRecipeFromEntity(Recipe domain, RecipeEntity entity) {
        assertThat(domain.getId(), is(entity.getId()));
        assertThat(domain.getTitle(), is(entity.getTitle()));
        assertThat(domain.getDescription(), is(entity.getDescription()));
        assertThat(domain.getCalories(), is(entity.getCalories()));
    }
}
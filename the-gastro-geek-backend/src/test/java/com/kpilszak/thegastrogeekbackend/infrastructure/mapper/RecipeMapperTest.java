package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe.RecipeEntity;
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
        var domainList = Instancio.ofList(RECIPE_MODEL).size(1).create();
        var domainPageable = PageRequest.of(0, 2);
        var domainPage = new PageImpl<>(domainList, domainPageable, domainList.size());

        var dtoPage = mapper.toDTOs(domainPage);

        assertRecipeToDTO(dtoPage.getContent().get(0), domainPage.getContent().get(0));
        assertPageMetadata(dtoPage, domainPage);
    }

    @Test
    void toEntity_shouldMapToEntity_whenDomainUsed() {
        var domain = Instancio.create(RECIPE_MODEL);

        var entity = mapper.toEntity(domain);

        assertRecipeToEntity(entity, domain);
    }

    @Test
    void fromEntity_shouldMapToDomain_whenEntityUsed() {
        var entity = Instancio.create(RECIPE_ENTITY_MODEL);

        var domain = mapper.fromEntity(entity);

        assertRecipeFromEntity(domain, entity);
    }

    @Test
    void fromEntities_shouldMapToDomains_whenPageUsed() {
        var entityList = Instancio.ofList(RECIPE_ENTITY_MODEL).size(1).create();
        var entityPageable = PageRequest.of(0, 2);
        var entityPage = new PageImpl<>(entityList, entityPageable, entityList.size());

        var domainPage = mapper.fromEntities(entityPage);

        assertRecipeFromEntity(domainPage.getContent().get(0), entityPage.getContent().get(0));
        assertPageMetadata(domainPage, entityPage);
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

    private static void assertRecipeToEntity(RecipeEntity entity, Recipe domain) {
        assertThat(entity.getId(), is(domain.getId()));
        assertThat(entity.getTitle(), is(domain.getTitle()));
        assertThat(entity.getDescription(), is(domain.getDescription()));
        assertThat(entity.getCalories(), is(domain.getCalories()));
    }

    private static void assertRecipeFromEntity(Recipe domain, RecipeEntity entity) {
        assertThat(domain.getId(), is(entity.getId()));
        assertThat(domain.getTitle(), is(entity.getTitle()));
        assertThat(domain.getDescription(), is(entity.getDescription()));
        assertThat(domain.getCalories(), is(entity.getCalories()));
        assertAuditFromEntity(domain, entity);
    }
}
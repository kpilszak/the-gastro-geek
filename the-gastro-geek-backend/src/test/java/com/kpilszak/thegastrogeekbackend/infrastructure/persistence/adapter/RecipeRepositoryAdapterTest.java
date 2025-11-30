package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.domain.model.recipe.Recipe;
import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe.RecipeEntity;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository.RecipeJpaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RecipeRepositoryAdapterTest {
    @InjectMocks
    private RecipeRepositoryAdapter adapter;

    @Mock
    private RecipeJpaRepository repository;

    @Mock
    private RecipeMapper mapper;

    @Test
    void findAllWithQuery_returnsQueryResponse_whenValid() {
        var pageable = PageRequest.of(0, 10);
        Page<RecipeEntity> entityPage = new PageImpl<>(List.of(new RecipeEntity()));
        Page<Recipe> domainPage = new PageImpl<>(List.of(new Recipe()));

        when(repository.findAll(pageable)).thenReturn(entityPage);
        when(mapper.fromEntities(entityPage)).thenReturn(domainPage);

        var result = adapter.findAll(pageable);

        assertThat(result, is(domainPage));

        verify(repository, times(1)).findAll(pageable);
        verify(mapper, times(1)).fromEntities(entityPage);
        verifyNoMoreInteractions(repository, mapper);
    }
}
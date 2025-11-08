package com.kpilszak.thegastrogeekbackend.domain.service;

import com.kpilszak.thegastrogeekbackend.domain.repository.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipeServiceTest {
    @InjectMocks
    private RecipeService service;

    @Mock
    private RecipeRepository repository;

    @Test
    void getPagedWithQuery()

}
package com.kpilszak.thegastrogeekbackend.application;

import com.kpilszak.thegastrogeekbackend.domain.service.RecipeService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipeManagementTest {
    @InjectMocks
    private RecipeManagement management;

    @Mock
    private RecipeService service;
}
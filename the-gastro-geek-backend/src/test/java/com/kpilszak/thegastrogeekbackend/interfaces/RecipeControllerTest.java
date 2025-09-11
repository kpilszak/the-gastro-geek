package com.kpilszak.thegastrogeekbackend.interfaces;

import com.kpilszak.thegastrogeekbackend.application.RecipeManagement;
import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@WebMvcTest(RecipeController.class)
class RecipeControllerTest {
    @MockitoBean
    private RecipeManagement management;

    @MockitoBean
    private RecipeMapper mapper;
}
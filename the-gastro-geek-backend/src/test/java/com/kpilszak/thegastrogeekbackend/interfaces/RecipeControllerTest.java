package com.kpilszak.thegastrogeekbackend.interfaces;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kpilszak.thegastrogeekbackend.application.RecipeManagement;
import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(RecipeController.class)
class RecipeControllerTest {
    @MockitoBean
    private RecipeManagement management;

    @MockitoBean
    private RecipeMapper mapper;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void create_returnsCreated() {}
}
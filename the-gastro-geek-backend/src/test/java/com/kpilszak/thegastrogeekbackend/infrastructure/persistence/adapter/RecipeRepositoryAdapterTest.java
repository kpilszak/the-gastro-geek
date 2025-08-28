package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.adapter;

import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.repository.RecipeJpaRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecipeRepositoryAdapterTest {
    @Mock
    private RecipeJpaRepository repository;

    @Mock
    private RecipeMapper mapper;

    @InjectMocks
    private RecipeRepositoryAdapter adapter;
}
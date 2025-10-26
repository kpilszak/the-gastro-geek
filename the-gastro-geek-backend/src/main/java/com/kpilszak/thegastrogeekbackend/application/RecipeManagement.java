package com.kpilszak.thegastrogeekbackend.application;

import com.kpilszak.thegastrogeekbackend.domain.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeManagement {
    private final RecipeService service;
}

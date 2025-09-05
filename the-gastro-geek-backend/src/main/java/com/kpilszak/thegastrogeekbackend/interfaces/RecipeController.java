package com.kpilszak.thegastrogeekbackend.interfaces;

import com.kpilszak.thegastrogeekbackend.application.RecipeManagement;
import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeRequestDTO;
import com.kpilszak.thegastrogeekbackend.application.dto.recipe.RecipeResponseDTO;
import com.kpilszak.thegastrogeekbackend.infrastructure.mapper.RecipeMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
@Validated
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeManagement management;
    private final RecipeMapper mapper;

    @PostMapping
    public RecipeResponseDTO create(@Valid @RequestBody RecipeRequestDTO requestDTO) { return null; }

    @GetMapping
    public Page<RecipeResponseDTO> getAll(Pageable pageable) {
        return mapper.toDTOs(management.getAll(pageable));
    }
}

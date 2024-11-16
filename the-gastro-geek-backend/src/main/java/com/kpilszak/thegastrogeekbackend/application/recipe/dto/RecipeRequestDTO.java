package com.kpilszak.thegastrogeekbackend.application.recipe.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeRequestDTO {
    private String title;
    private String description;
    private int calories;
}
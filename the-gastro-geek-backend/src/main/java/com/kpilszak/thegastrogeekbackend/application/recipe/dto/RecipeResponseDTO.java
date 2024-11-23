package com.kpilszak.thegastrogeekbackend.application.recipe.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeResponseDTO {
    private Long id;
    private String title;
    private String description;
    private int calories;
}

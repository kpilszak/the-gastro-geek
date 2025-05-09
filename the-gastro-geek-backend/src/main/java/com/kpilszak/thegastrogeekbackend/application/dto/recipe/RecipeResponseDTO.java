package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeResponseDTO extends AbstractResponseDTO {
    private Long id;
    private String title;
    private String description;
    private int calories;
}

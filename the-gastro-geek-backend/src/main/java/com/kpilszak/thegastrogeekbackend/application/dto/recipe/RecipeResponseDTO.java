package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import com.kpilszak.thegastrogeekbackend.application.dto.AbstractResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class RecipeResponseDTO extends AbstractResponseDTO {
    private Long id;
    private String title;
    private String description;
    private int calories;
}

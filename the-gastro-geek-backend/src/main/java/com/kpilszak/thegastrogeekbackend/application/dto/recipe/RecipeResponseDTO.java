package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import com.kpilszak.thegastrogeekbackend.application.dto.AbstractResponseDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeResponseDTO extends AbstractResponseDTO {
    private String title;

    private String description;

    private int calories;
}

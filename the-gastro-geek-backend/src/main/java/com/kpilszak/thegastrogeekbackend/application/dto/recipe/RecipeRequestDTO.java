package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeRequestDTO extends RecipeBaseRequestDTO {
    private Long id;
}


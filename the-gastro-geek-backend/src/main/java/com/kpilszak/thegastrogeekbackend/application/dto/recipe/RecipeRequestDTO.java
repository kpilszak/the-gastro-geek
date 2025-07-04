package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class RecipeRequestDTO extends RecipeBaseRequestDTO {
    @ToString.Include
    private Long id;
}


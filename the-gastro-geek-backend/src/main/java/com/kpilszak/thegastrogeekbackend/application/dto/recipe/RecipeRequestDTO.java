package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class RecipeRequestDTO extends RecipeBaseRequestDTO {
    private String id;
}


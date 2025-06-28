package com.kpilszak.thegastrogeekbackend.application.dto.recipe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class RecipeBaseRequestDTO {
    private String title;
    private String description;
    private int calories;
}


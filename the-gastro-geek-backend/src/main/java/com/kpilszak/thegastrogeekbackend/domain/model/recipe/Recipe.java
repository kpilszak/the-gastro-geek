package com.kpilszak.thegastrogeekbackend.domain.model.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private Long id;
    private String title;
    private String description;
    private int calories;
}

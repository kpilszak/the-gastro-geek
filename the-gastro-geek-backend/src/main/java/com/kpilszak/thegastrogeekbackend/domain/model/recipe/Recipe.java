package com.kpilszak.thegastrogeekbackend.domain.model.recipe;

import com.kpilszak.thegastrogeekbackend.domain.common.AbstractDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe extends AbstractDomain {
    private Long id;
    private String title;
    private String description;
    private int calories;
}

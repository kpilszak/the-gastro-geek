package com.kpilszak.thegastrogeekbackend.domain.model.recipe;

import com.kpilszak.thegastrogeekbackend.domain.model.AbstractDomain;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe extends AbstractDomain {
    @ToString.Include
    private String title;

    private String description;

    private int calories;
}

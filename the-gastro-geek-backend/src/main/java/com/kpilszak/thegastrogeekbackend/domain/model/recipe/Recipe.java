package com.kpilszak.thegastrogeekbackend.domain.model.recipe;

import com.kpilszak.thegastrogeekbackend.domain.model.AbstractDomain;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = true)
public class Recipe extends AbstractDomain {
    @ToString.Include
    private String title;

    private String description;

    private int calories;
}

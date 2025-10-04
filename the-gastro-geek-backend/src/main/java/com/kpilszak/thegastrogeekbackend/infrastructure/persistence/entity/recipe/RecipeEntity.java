package com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.recipe;

import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "recipes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = true)
public class RecipeEntity extends AbstractEntity {
    @ToString.Include
    private String title;

    private String description;

    private int calories;
}

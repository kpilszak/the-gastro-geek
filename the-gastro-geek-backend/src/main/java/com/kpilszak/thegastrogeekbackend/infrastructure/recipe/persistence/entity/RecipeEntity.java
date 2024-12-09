package com.kpilszak.thegastrogeekbackend.infrastructure.recipe.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "recipes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = {"description", "calories"})
@EqualsAndHashCode(of = {"id"})
public class RecipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private int calories;
}

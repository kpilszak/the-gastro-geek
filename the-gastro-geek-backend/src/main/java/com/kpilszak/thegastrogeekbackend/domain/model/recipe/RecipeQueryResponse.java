package com.kpilszak.thegastrogeekbackend.domain.model.recipe;

import com.kpilszak.thegastrogeekbackend.domain.model.QueryResponse;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeQueryResponse extends QueryResponse<Recipe> {
    public RecipeQueryResponse(QueryResponse<Recipe> queryResponse) {
        this.setData(queryResponse.getData());
        this.setPagination(queryResponse.getPagination());
    }
}

package com.kpilszak.thegastrogeekbackend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Pagination {
    private Integer pageElements;

    private Integer currentPage;

    private Long totalElements;

    private Integer totalPages;
}

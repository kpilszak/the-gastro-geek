package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.recipe.AbstractResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.AbstractDomain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AbstractMapperTest {
    protected static void assertAuditToDTO(AbstractResponseDTO dto, AbstractDomain domain) {
        assertThat(dto.getCreatedBy(), is(domain.getCreatedBy()));
        assertThat(dto.getUpdatedBy(), is(domain.getUpdatedBy()));
        assertThat(dto.getCreatedDate(), is(domain.getCreatedDate()));
        assertThat(dto.getUpdatedDate(), is(domain.getUpdatedDate()));
        assertThat(dto.getVersion(), is(domain.getVersion()));
    }
}

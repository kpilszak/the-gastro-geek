package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.AbstractResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.AbstractDomain;
import org.springframework.data.domain.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AbstractMapperTest {
    protected static void assertAuditToDTO(AbstractResponseDTO dto, AbstractDomain domain) {
        assertThat(dto.getCreatedBy(), is(domain.getCreatedBy()));
        assertThat(dto.getUpdatedBy(), is(domain.getLastUpdatedBy()));
        assertThat(dto.getCreatedDate(), is(domain.getCreatedDate()));
        assertThat(dto.getUpdatedDate(), is(domain.getLastUpdatedDate()));
        assertThat(dto.getVersion(), is(domain.getVersion()));
    }

    protected static void assertPageMetadataToDTO(Page<?> dtoPage, Page<?> domainPage) {
        assertThat(dtoPage.getTotalElements(), is(domainPage.getTotalElements()));
        assertThat(dtoPage.getNumber(), is(domainPage.getNumber()));
        assertThat(dtoPage.getSize(), is(domainPage.getSize()));
        assertThat(dtoPage.getContent().size(), is(domainPage.getContent().size()));
    }
}

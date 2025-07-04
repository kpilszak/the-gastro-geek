package com.kpilszak.thegastrogeekbackend.infrastructure.mapper;

import com.kpilszak.thegastrogeekbackend.application.dto.AbstractResponseDTO;
import com.kpilszak.thegastrogeekbackend.domain.model.AbstractDomain;
import com.kpilszak.thegastrogeekbackend.infrastructure.persistence.entity.AbstractEntity;
import org.springframework.data.domain.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AbstractMapperTest {
    protected static void assertAuditToDTO(AbstractResponseDTO dto, AbstractDomain domain) {
        assertThat(dto.getCreatedBy(), is(domain.getCreatedBy()));
        assertThat(dto.getCreatedDate(), is(domain.getCreatedDate()));
        assertThat(dto.getLastModifiedBy(), is(domain.getLastModifiedBy()));
        assertThat(dto.getLastModifiedDate(), is(domain.getLastModifiedDate()));
        assertThat(dto.getVersion(), is(domain.getVersion()));
    }

    protected static void assertPageMetadata(Page<?> mapTo, Page<?> mapFrom) {
        assertThat(mapTo.getTotalElements(), is(mapFrom.getTotalElements()));
        assertThat(mapTo.getNumber(), is(mapFrom.getNumber()));
        assertThat(mapTo.getSize(), is(mapFrom.getSize()));
        assertThat(mapTo.getContent().size(), is(mapFrom.getContent().size()));
    }

    protected static void assertAuditFromEntity(AbstractDomain domain, AbstractEntity entity) {
        assertThat(domain.getCreatedBy(), is(entity.getCreatedBy()));
        assertThat(domain.getCreatedDate(), is(entity.getCreatedDate()));
        assertThat(domain.getLastModifiedBy(), is(entity.getLastModifiedBy()));
        assertThat(domain.getLastModifiedDate(), is(entity.getLastModifiedDate()));
        assertThat(domain.getVersion(), is(entity.getVersion()));
    }
}

package com.summer.rest.org.scope;

import com.summer.service.org.scope.ScopeDto;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.hateoas.server.EntityLinks;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.hateoas.server.TypedEntityLinks;

@Component
public class ScopeModelAssembler extends RepresentationModelAssemblerSupport<ScopeDto, ScopeModel> {

    private TypedEntityLinks.ExtendedTypedEntityLinks<ScopeDto> links;

    @Autowired
    public ScopeModelAssembler(EntityLinks entityLinks, ModelMapper modelMapper) {
        super(ScopeController.class, ScopeModel.class);
        this.links = entityLinks.forType(ScopeDto.class, ScopeDto::getId);
    }

    @Override
    public ScopeModel toModel(ScopeDto scope) {
        ScopeModel model = new ScopeModel();
        model.setId(scope.getId());
        model.setPermission(scope.getPermission());
        model.setTarget(scope.getTarget());
        model.add(links.linkToItemResource(scope), links.linkToCollectionResource().withRel("scopes"));
        return model;
    }

    public ScopeDto toDto(ScopeModel scope) {
        return new ScopeDto(scope.getId(), scope.getPermission(), scope.getTarget());
    }
}

package com.summer.rest.org.scope;

import com.summer.service.org.scope.ScopeDto;
import com.summer.service.org.scope.ScopeService;

import com.fasterxml.jackson.annotation.JsonView;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.hateoas.server.TypedEntityLinks;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("org/scopes")
@ExposesResourceFor(ScopeDto.class)
public class ScopeController {

    private ScopeService service;
    private ScopeModelAssembler assembler;
    private TypedEntityLinks.ExtendedTypedEntityLinks<ScopeDto> links;
    private ModelMapper modelMapper;

    @Autowired
    public ScopeController(
            ScopeService scopeService,
            ScopeModelAssembler scopeModelAssembler,
            EntityLinks entityLinks,
            ModelMapper modelMapper) {
        this.service = scopeService;
        this.assembler = scopeModelAssembler;
        this.links = entityLinks.forType(ScopeDto.class, ScopeDto::getId);
        this.modelMapper = modelMapper;
    }

    // Collection Resource
    // ================================================================================================================

    @PostMapping(produces = "application/hal+json")
    public ScopeModel post(@JsonView(ScopeModel.Basic.class) @RequestBody ScopeModel scope) {
        ScopeDto dto = modelToDto(scope);
        return assembler.toModel(service.createOne(dto));
    }

    @GetMapping(produces = "application/hal+json")
    public CollectionModel<ScopeModel> get() {
        List<ScopeModel> scopes = service.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
        return new CollectionModel<>(scopes, links.linkToCollectionResource());
    }

    // Item Resource
    // ================================================================================================================

    @GetMapping(path = "{id}", produces = "application/hal+json")
    public ScopeModel getById(@PathVariable Long id) {
        return assembler.toModel(service.findOneById(id));
    }

//    @PutMapping("{id}")
//    public ScopeModel putById(
//            @PathVariable Long id,
//            @JsonView(ScopeModel.Basic.class) @RequestBody ScopeModel scope) {
//        scope.setId(id);
//        return service.findById(id)
//                .map(scope ->
//                    return service.save(assembler.toDto(scope));
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return repository.save(newEmployee);
//                });
//    }

//    @PatchMapping("{id}")
//    @JsonView(ScopeModel.WithId.class)
//    public ResponseEntity<ScopeDto> patchById(@PathVariable Long id) {
//    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteOneById(id);
    }

    // Property Resource
    // ================================================================================================================

    @GetMapping("{id}/some")
    public void getSomeById(@PathVariable Long id) {
        service.deleteOneById(id);
    }

    // Search Resource
    // ================================================================================================================

    @GetMapping("{id}/search")
    public void getSearchById(@PathVariable Long id) {
        service.deleteOneById(id);
    }

    // Query Method Resource
    // ================================================================================================================

    @GetMapping("{id}/search/someThing")
    public void searchSomeThingById(@PathVariable Long id) {
        service.deleteOneById(id);
    }


    // Helper methods
    // ================================================================================================================

    private ScopeDto modelToDto(ScopeModel model) {
        return modelMapper.map(model, ScopeDto.class);
    }
}

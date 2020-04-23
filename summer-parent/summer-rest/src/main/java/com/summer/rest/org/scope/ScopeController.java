package com.summer.rest.org.scope;

import com.summer.service.org.scope.ScopeDto;
import com.summer.service.org.scope.ScopeService;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    public ScopeController(
            ScopeService scopeService,
            ScopeModelAssembler scopeModelAssembler,
            EntityLinks entityLinks) {
        this.service = scopeService;
        this.assembler = scopeModelAssembler;
        this.links = entityLinks.forType(ScopeDto.class, ScopeDto::getId);
    }

    // Collection Resource
    // ================================================================================================================

    @PostMapping(produces = "application/hal+json")
    public ScopeModel post(@JsonView(ScopeModel.Basic.class) @RequestBody ScopeModel scope) {
        return assembler.toModel(service.save(assembler.toDto(scope)));
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
        return service.findById(id)
                .map(assembler::toModel)
                .orElseThrow(() -> new ScopeNotFoundException(id));
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
        service.deleteById(id);
    }

    // Search Resource
    // ================================================================================================================


    // Query Method Resource
    // ================================================================================================================
}

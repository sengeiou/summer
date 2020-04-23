package com.summer.rest.org.scope;

import com.fasterxml.jackson.annotation.JsonView;
import com.summer.service.org.scope.Permission;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Relation(value = "scope", collectionRelation = "scopes")
public class ScopeModel extends RepresentationModel<ScopeModel> {

    public interface Basic {
    }

    private Long id;
    @JsonView(Basic.class)
    private Permission permission;
    @JsonView(Basic.class)
    private String target;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}

package com.summer.service.org.role;

import com.summer.service.org.scope.ScopeDto;

import java.util.Set;

public class Role {

    private Long id;
    private String name;
    private Set<ScopeDto> scopes;

    public Role(Long id, String name, Set<ScopeDto> scopes) {
        this.id = id;
        this.name = name;
        this.scopes = scopes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ScopeDto> getScopes() {
        return scopes;
    }

    public void setScopes(Set<ScopeDto> scopes) {
        this.scopes = scopes;
    }

    @Override
    public String toString() {
        return "RoleDto{id=" + id + ", name='" + name + "'}";
    }
}

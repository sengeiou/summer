package com.summer.service.org.role;

import com.summer.service.org.scope.ScopeQueryDto;

import java.util.Set;

public class RoleQueryDto {

    private Set<ScopeQueryDto> scopes;

    public Set<ScopeQueryDto> getScopes() {
        return scopes;
    }

    public void setScopes(Set<ScopeQueryDto> scopes) {
        this.scopes = scopes;
    }
}

package com.summer.service.org.role;

import com.summer.service.org.scope.ScopeEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Role {

    @Id
    private Long id;

    private String name;

    @ManyToMany
    private Set<ScopeEntity> scopes;

    public Set<ScopeEntity> getScopes() {
        return scopes;
    }

    public void setScopes(Set<ScopeEntity> scopes) {
        this.scopes = scopes;
    }
}

package com.summer.service.org.scope;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ScopeEntity {

    @Id
    private Long id;
    private String scope;

    public ScopeEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}

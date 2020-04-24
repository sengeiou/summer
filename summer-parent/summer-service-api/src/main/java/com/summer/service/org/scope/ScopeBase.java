package com.summer.service.org.scope;

import com.summer.service.AbstractIdentifiable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ScopeBase extends AbstractIdentifiable {

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Permission permission;

    @Column(nullable = false)
    private String target;

    public ScopeBase(Long id, Permission permission, String target) {
        super.setId(id);
        this.permission = permission;
        this.target = target;
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

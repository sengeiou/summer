package com.summer.service.org.scope;

public class ScopeDto {

    private Long id;
    private Permission permission;
    private String target;

    public ScopeDto(Long id, Permission permission, String target) {
        this.id = id;
        this.permission = permission;
        this.target = target;
    }

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

package com.summer.service.org.scope;

public class ScopeDto {

    private Long id;
    private Permission permission;
    private String target;

    public ScopeDto() {
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

    @Override
    public String toString() {
        return "ScopeDto{id=" + id + ", permission=" + permission + ", target='" + target + "'}";
    }
}

package com.summer.service.org.scope;

public class ScopeCreateDto {

    private Permission perm;
    private String target;

    public ScopeCreateDto(Permission perm, String target) {
        this.perm = perm;
        this.target = target;
    }

    public Permission getPerm() {
        return perm;
    }

    public void setPerm(Permission perm) {
        this.perm = perm;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}

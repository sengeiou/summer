package com.summer.service.org.user;

import com.summer.service.org.role.RoleDto;

import java.util.Set;

public class UserDto {

    private Long id;
    private String username;
    private Boolean enabled;
    private Set<RoleDto> roles;

    public UserDto(Long id, String username, Boolean enabled, Set<RoleDto> roles) {
        this.id = id;
        this.username = username;
        this.enabled = enabled;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Set<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDto> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserDto{id=" + id + ", username='" + username + "', enabled=" + enabled + ", roles=" + roles + "}";
    }
}

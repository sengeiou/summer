package com.summer.service.org.user;

import com.summer.service.org.role.RoleQueryDto;

import java.util.Set;

public class UserPassQueryDto {

    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private Set<RoleQueryDto> roles;

    public UserPassQueryDto(Long id, String username, String password, Boolean enabled, Set<RoleQueryDto> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Set<RoleQueryDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleQueryDto> roles) {
        this.roles = roles;
    }
}

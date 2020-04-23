package com.summer.service.org.scope;

import com.summer.service.org.role.Role;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "tb_scope")
public class Scope extends BaseScope {

    @ManyToMany(mappedBy = "scopes")
    private Set<Role> roles;

    public Scope() {
        super(null, null, null);
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

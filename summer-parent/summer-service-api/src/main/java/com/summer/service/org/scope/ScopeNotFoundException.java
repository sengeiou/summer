package com.summer.service.org.scope;

import com.summer.service.AbstractNotFoundException;

public class ScopeNotFoundException extends AbstractNotFoundException {

    ScopeNotFoundException(Long id) {
        super("Could not find Scope " + id);
    }
}

package com.summer.service.org.scope;

public class ScopeNotFoundException extends RuntimeException {

    ScopeNotFoundException(Long id) {
        super("Could not find Scope " + id);
    }
}

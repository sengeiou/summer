package com.summer.rest.org.scope;

public class ScopeNotFoundException extends RuntimeException {

    ScopeNotFoundException(Long id) {
        super("Could not find Scope " + id);
    }
}

package com.summer.service.org.scope;

public interface ScopeService {

    ScopeQueryDto createScope(ScopeCreateDto scope);

    ScopeQueryDto findScopeById(Long id);
}

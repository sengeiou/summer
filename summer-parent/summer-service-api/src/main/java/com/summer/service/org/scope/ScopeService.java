package com.summer.service.org.scope;

import java.util.List;

public interface ScopeService {

    List<ScopeDto> findAll();

    ScopeDto createOne(ScopeDto scope);

    ScopeDto findOneById(Long id);

    void deleteOneById(Long id);
}

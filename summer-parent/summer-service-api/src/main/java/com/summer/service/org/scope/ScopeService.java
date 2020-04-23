package com.summer.service.org.scope;

import java.util.List;
import java.util.Optional;

public interface ScopeService {

    List<ScopeDto> findAll();
    ScopeDto save(ScopeDto scope);

    Optional<ScopeDto> findById(Long id);

    void deleteById(Long id);
}

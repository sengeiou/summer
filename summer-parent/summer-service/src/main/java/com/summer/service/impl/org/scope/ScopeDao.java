package com.summer.service.impl.org.scope;

import com.summer.service.org.scope.ScopeDto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ScopeDao extends JpaRepository<Scope, Long> {

    List<ScopeDto> findAllByOrderByIdAsc();

    Optional<ScopeDto> findOneById(Long id);
}

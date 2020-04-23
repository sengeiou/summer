package com.summer.service.impl.org.scope;

import com.summer.service.org.scope.ScopeDto;
import com.summer.service.org.scope.ScopeService;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScopeServiceImpl implements ScopeService {

    private ScopeDao dao;
    private ModelMapper modelMapper;

    @Autowired
    public ScopeServiceImpl(ScopeDao scopeDao, ModelMapper modelMapper) {
        this.dao = scopeDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ScopeDto> findAll() {
        return dao.findAllByOrderByIdAsc();
    }

    @Override
    public ScopeDto save(ScopeDto scope) {
        System.out.println(scope);
        scope.setId(null);
        Scope entity = dtoToEntity(scope);
        dao.save(entity);
        return entityToDto(entity);
    }

    @Override
    public Optional<ScopeDto> findById(Long id) {
        return dao.findOneById(id);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    private Scope dtoToEntity(ScopeDto dto) {
        return modelMapper.map(dto, Scope.class);
    }

    private ScopeDto entityToDto(Scope entity) {
        return new ScopeDto(entity.getId(), entity.getPermission(), entity.getTarget());
    }
}

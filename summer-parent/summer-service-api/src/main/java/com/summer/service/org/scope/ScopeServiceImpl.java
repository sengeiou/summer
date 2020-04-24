package com.summer.service.org.scope;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return dao.findAllByOrderByIdAsc().stream().map(this::baseToDto).collect(Collectors.toList());
    }

    @Override
    public ScopeDto createOne(ScopeDto scope) {
        scope.setId(null);
        Scope entity = dtoToEntity(scope);
        dao.saveAndFlush(entity);
        return entityToDto(entity);
    }

    @Override
    public ScopeDto findOneById(Long id) {
        return dao.findOneById(id)
                .map(this::baseToDto)
                .orElseThrow(() -> new ScopeNotFoundException(id));
    }

    @Override
    public void deleteOneById(Long id) {
        dao.deleteById(id);
    }

    private Scope dtoToEntity(ScopeDto dto) {
        return modelMapper.map(dto, Scope.class);
    }

    private ScopeDto entityToDto(Scope entity) {
        return modelMapper.map(entity, ScopeDto.class);
    }

    private ScopeDto baseToDto(ScopeBase base) {
        return modelMapper.map(base, ScopeDto.class);
    }
}

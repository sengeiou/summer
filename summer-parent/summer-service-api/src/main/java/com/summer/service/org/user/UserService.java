package com.summer.service.org.user;

import com.summer.service.org.scope.ScopeDto;

import java.util.List;
import java.util.Set;

public interface UserService {

//    @PreAuthorize("hasRole('ADMIN')")
//    UserDtoR findUserPassByUsername(String username);

    List<UserDto> findAllUsers();
    UserDto createUser(UserDto user);

    UserDto findUserById(Long id);
    UserDto updateUser(UserDto user);
    UserDto replaceUser(UserDto user);
    int deleteUserById(Long id);
    UserDto findUserWithScopesByUsername(String username);

    Set<ScopeDto> findUserScopesById(Long id);
}

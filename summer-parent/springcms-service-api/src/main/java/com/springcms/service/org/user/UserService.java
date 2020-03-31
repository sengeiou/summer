package com.springcms.service.org.user;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    @PreAuthorize("hasRole('ADMIN')")
    String foobar();

    UserQueryDto findUser();
}

package com.summer.service.auth.jwttoken;

import org.springframework.security.access.prepost.PreAuthorize;

public interface JwtTokenService {

    @PreAuthorize("isAuthenticated()")
    String getToken();
}

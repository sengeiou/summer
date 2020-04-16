package com.summer.rest.auth;

import com.summer.service.auth.jwttoken.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class JwtTokenController {

    JwtTokenService jwtTokenService;

    @Autowired
    public JwtTokenController(JwtTokenService jwtTokenService) {
        this.jwtTokenService = jwtTokenService;
    }

    @GetMapping
    public JwtToken get() {
        JwtToken token = jwtTokenService.getToken();
        return token;
    }
}

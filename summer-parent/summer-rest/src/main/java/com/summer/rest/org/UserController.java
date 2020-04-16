package com.summer.rest.org;

import com.summer.service.org.user.UserCreateDto;
import com.summer.service.org.user.UserPassQueryDto;
import com.summer.service.org.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public List<UserPassQueryDto> get() {
        return new ArrayList<>();
    }

    @PostMapping
    public UserPassQueryDto post(@RequestBody UserCreateDto user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return null;
    }
}

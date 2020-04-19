package com.summer.rest.org;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${summer.org.context-path:org}/roles")
public class RoleController {

    @GetMapping
    public String get() {
        return "roles";
    }
}

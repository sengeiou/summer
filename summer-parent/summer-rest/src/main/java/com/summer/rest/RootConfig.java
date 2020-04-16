package com.summer.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.summer.service"})
//@Import(com.summer.web.WebSecurityConfig.class)
public class RootConfig {
}

package com.summer.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.summer.service")
@Import({DataJpaConfig.class, MethodSecurityConfig.class, WebSecurityConfig.class})
public class RootConfig {
}

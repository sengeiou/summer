package com.summer.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackageClasses = com.summer.rest.org.Pkg.class)
@EnableWebMvc
class WebMvcConfigOrg implements WebMvcConfigurer {
}

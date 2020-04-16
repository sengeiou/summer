package com.summer.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig {

    @Configuration
    @ComponentScan(basePackages = "com.summer.rest.auth")
    @EnableWebMvc
    public static class AuthWebConfig implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/**").addResourceLocations("classpath:/static/auth/");
        }
    }

    @Configuration
    @ComponentScan(basePackages = "com.summer.rest.cms")
    @EnableWebMvc
    public static class CmsWebConfig implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        }
    }

    @Configuration
    @ComponentScan(basePackages = "com.summer.rest.org")
    @EnableWebMvc
    public static class OrgWebConfig implements WebMvcConfigurer {
    }
}

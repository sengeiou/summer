package com.summer.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.hateoas.config.EnableHypermediaSupport;

@Configuration
@ComponentScan(basePackageClasses = com.summer.rest.Pkg.class)
@EnableWebMvc
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
class WebMvcConfig implements WebMvcConfigurer {

    private static final String[] RESOURCE_HANDLER_PATH_PATTERNS = {"/"};
    private static final String[] RESOURCE_LOCATIONS = {
            "classpath:/static/", "classpath:/public/", "classpath:/resources/", "classpath:/META-INF/resources"
    };

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(RESOURCE_HANDLER_PATH_PATTERNS).addResourceLocations(RESOURCE_LOCATIONS);
    }
}

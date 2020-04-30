package com.summer.netty.config;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {

    private ResourceProperties resourceProps;
    private WebFluxProperties webFluxProps;

    @Autowired
    public WebFluxConfig(ResourceProperties resourceProps, WebFluxProperties webFluxProps) {
        this.resourceProps = resourceProps;
        this.webFluxProps = webFluxProps;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (resourceProps.isAddMappings())
            registry.addResourceHandler(webFluxProps.getStaticPathPattern())
                    .addResourceLocations(resourceProps.getStaticLocations());
    }

    @Bean
    public static ResourceProperties resourceProperties(
            @Value("${spring.resources.add-mappings}") boolean add,
            @Value("${spring.resources.static-locations}") String[] locations) {
        ResourceProperties props = new ResourceProperties();
        props.setAddMappings(add);
        props.setStaticLocations(locations);
        return props;
    }

    @Bean
    public static WebFluxProperties webFluxProperties(
            @Value("${spring.webflux.static-path-pattern}") String path) {
        WebFluxProperties props = new WebFluxProperties();
        props.setStaticPathPattern(path);
        return props;
    }
}

package com.summer.netty;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@ComponentScan(basePackageClasses = com.summer.controller.Pkg.class)
@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {
}

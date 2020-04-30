package com.summer.netty.config;

import com.summer.netty.handler.BeanHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;

import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@ComponentScan(basePackageClasses = com.summer.netty.handler.Pkg.class)
public class RouterConfig {

    @Bean
    public static RouterFunction<?> beanRouter(BeanHandler handler) {
        return route()
                .GET("/beans", accept(MediaType.APPLICATION_JSON), handler::get)
                .GET("/error", handler::error)
                .GET("/session", handler::session)
                .build();
    }
}

package com.summer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/beans")
public class BeanController{

    private ApplicationContext context;

    @Autowired
    public BeanController(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping
    public Mono<List<String>> get() {
        return Mono.just(Arrays.asList(context.getBeanDefinitionNames()));
    }
}

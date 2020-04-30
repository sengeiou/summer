package com.summer.netty.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import org.springframework.web.server.WebSession;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@Component
public class BeanHandler {

    private static Log log = LogFactory.getLog(BeanHandler.class);

    private ApplicationContext context;

    @Autowired
    public BeanHandler(ApplicationContext context) {
        this.context = context;
    }

    public Mono<ServerResponse> get(ServerRequest request) {
        String[] beans = context.getBeanDefinitionNames();
        Arrays.sort(beans);
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Flux.fromArray(beans), Object.class);
    }

    public Mono<ServerResponse> error(ServerRequest request) {
        throw new AbstractNotFoundException("error");
    }

    public Mono<ServerResponse> session(ServerRequest request) {
        //request.session().subscribe(session -> session.getAttributes().put("hello","world"));
        return ServerResponse
                .ok()
                //.body(request.session(), WebSession.class);
                .body(
                        request.session()
                                .map(session -> {
                                    session.getAttributes().put("hello", "world");
                                    return "ok";
                                }),
                        Object.class
                );
    }
}

package com.summer.netty;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.server.adapter.WebHttpHandlerBuilder;

import reactor.netty.DisposableServer;
import reactor.netty.http.server.HttpServer;

public class Application {

    public static final String HOST = "localhost";
    public static final int PORT = 8080;
    public static final Class<?> COMPONENT_CLASS = RootConfig.class;

    public static void main(String[] args) {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(COMPONENT_CLASS);
        context.refresh();

        HttpHandler handler = WebHttpHandlerBuilder.applicationContext(context).build();
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(handler);

        DisposableServer server = HttpServer.create().host(HOST).port(PORT).handle(adapter).bindNow();
        server.onDispose().block();
    }
}

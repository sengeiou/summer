package com.summer.netty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.server.adapter.WebHttpHandlerBuilder;

import reactor.netty.DisposableServer;
import reactor.netty.http.server.HttpServer;

public class Launcher {

    public static final String HOST = "localhost";
    public static final int PORT = 8080;
    public static final Class<?> COMPONENT_CLASS = com.summer.netty.config.RootConfig.class;

    public static final Log log = LogFactory.getLog(Launcher.class);

    public static void main(String[] args) {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(COMPONENT_CLASS);
        context.refresh();
        log.debug("Application context initialized");

        HttpHandler handler = WebHttpHandlerBuilder.applicationContext(context).build();
        log.debug("HttpHandler created");

        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(handler);
        DisposableServer server = HttpServer.create().host(HOST).port(PORT).handle(adapter).bindNow();
        log.debug("HttpServer initialized");

        server.onDispose().block();
        log.debug("HttpServer closed");
    }
}

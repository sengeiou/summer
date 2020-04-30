package com.summer.servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.context.annotation.RequestScope;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class RootConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean
//    @RequestScope
//    public static Holder holder(HttpServletRequest request) {
//        return new Holder(request.getParameter("foo"));
//    }
//
//    public static class Holder {
//        private final String value;
//
//        public Holder(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//    }

}



package com.summer.netty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import({WebFluxConfig.class, RouterConfig.class})
@PropertySource("classpath:/application.properties")
public class RootConfig {

//    @Bean
//    public MongoClient mongo() {
//        return new MongoClient("localhost");
//    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}

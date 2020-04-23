package com.summer.web;

import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackageClasses = com.summer.service.impl.Pkg.class)
//@Import({DataJpaConfig.class, MethodSecurityConfig.class, WebSecurityConfig.class})
@Import({DataJpaConfig.class})
@PropertySource({"classpath:/application.properties", "classpath:/summer.properties"})
@EnableAspectJAutoProxy
public class RootConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

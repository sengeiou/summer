package com.summer.web;

import com.zaxxer.hikari.HikariDataSource;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.orm.jpa.vendor.Database;

@Configuration
@ComponentScan(basePackageClasses = com.summer.service.org.Pkg.class)
//@Import({DataJpaConfig.class, MethodSecurityConfig.class, WebSecurityConfig.class})
@Import({DataJpaConfig.class, RootConfig.DevConfig.class})
@PropertySource("classpath:/application.properties")
@EnableAspectJAutoProxy
public class RootConfig {





    @Configuration
    @Profile("production")
    @PropertySource("classpath:/summer.properties")
    public static class ProdConfig {

        @Bean
        public static DataSourceProperties orgDataSourceProps(
                @Value("${summer.org.datasource.driver-class-name}") String driverClassName,
                @Value("${summer.org.datasource.url}") String url,
                @Value("${summer.org.datasource.username}") String username,
                @Value("${summer.org.datasource.password}") String password) {
            DataSourceProperties props = new DataSourceProperties();
            props.setUsername(username);
            props.setPassword(password);
            props.setUrl(url);
            props.setDriverClassName(driverClassName);
            return props;
        }

        @Bean(name = "orgDataSource")
        public static HikariDataSource orgProdDataSource(@Qualifier("orgDataSourceProps") DataSourceProperties props) {
            HikariDataSource ds = new HikariDataSource();
            ds.setDriverClassName(props.getDriverClassName());
            ds.setUsername(props.getUsername());
            ds.setPassword(props.getPassword());
            ds.setJdbcUrl(props.getUrl());
            return ds;
        }
    }

    @Configuration
    @Profile("dev")
    @PropertySource("classpath:/summer.properties")
    public static class DevConfig {

        @Bean(name = "orgDataSource")
        public static HikariDataSource orgDevDataSource(@Qualifier("orgDataSourceProps") DataSourceProperties props) {
            HikariDataSource ds = new HikariDataSource();
            ds.setDriverClassName(props.getDriverClassName());
            ds.setUsername(props.getUsername());
            ds.setPassword(props.getPassword());
            ds.setJdbcUrl(props.getUrl());
            return ds;
        }
    }


}

package com.summer.web;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DataJpaConfig {

    @Bean
    public static HibernateJpaVendorAdapter jpaVendorAdapter(JpaProperties props) {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(props.getDatabase());
        adapter.setShowSql(props.isShowSql());
        adapter.setGenerateDdl(props.isGenerateDdl());
        adapter.setDatabasePlatform(props.getDatabasePlatform());
        return adapter;
    }

    @Bean
    public static JpaProperties jpaProperties(
            @Value("${spring.jpa.database}") Database database,
            @Value("${spring.jpa.show-sql}") boolean showSql,
            @Value("${spring.jpa.generate-ddl}") boolean generateDdl,
            @Value("${spring.jpa.database-platform}") String databasePlatform) {
        JpaProperties properties = new JpaProperties();
        properties.setDatabase(database);
        properties.setShowSql(showSql);
        properties.setGenerateDdl(generateDdl);
        properties.setDatabasePlatform(databasePlatform);
        return properties;
    }

    @Configuration
    @EnableJpaRepositories(
            basePackageClasses = {OrgDataConfig.BASE_PACKAGE_CLASS},
            entityManagerFactoryRef = "orgEntityManagerFactory",
            transactionManagerRef = "orgTxManager")
    public static class OrgDataConfig {

        private static final String PERSISTENCE_UNIT_NAME = "orgPU";
        private static final Class<?> BASE_PACKAGE_CLASS = com.summer.service.org.Pkg.class;
        private static final String BASE_PACKAGE_NAME = BASE_PACKAGE_CLASS.getPackage().getName();

        @Bean
        public static LocalContainerEntityManagerFactoryBean orgEntityManagerFactory(
                @Qualifier("orgDataSource") DataSource dataSource,
                JpaVendorAdapter jpaVendorAdapter) {
            LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
            emfb.setDataSource(dataSource);
            emfb.setJpaVendorAdapter(jpaVendorAdapter);
            emfb.setPackagesToScan(BASE_PACKAGE_NAME);
            emfb.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
            return emfb;
        }

        @Bean
        public static JpaTransactionManager orgTxManager(
                @Qualifier("orgEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
            JpaTransactionManager txManager = new JpaTransactionManager();
            txManager.setEntityManagerFactory(entityManagerFactory);
            return txManager;
        }
    }
}

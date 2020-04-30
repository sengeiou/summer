package com.summer.war;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.annotation.RequestScope;

import javax.servlet.http.HttpServletRequest;

@Configuration
@Profile("test")
public class TestConfig {

//    @Autowired
//    @Qualifier("httpServletRequest")
//    private HttpServletRequest request;

    @Bean
    @RequestScope
    public Holder holder(HttpServletRequest request) {
        Holder holder = new Holder();
        holder.setValue(request.getParameter("shit"));
        return holder;
    }

//    @Bean
//    public static EmbeddedDatabase dataSource() {
//        return new EmbeddedDatabaseBuilder().build();
//                .generateUniqueName(true)
//                .setType(EmbeddedDatabaseType.HSQL)
//                .setScriptEncoding("UTF-8")
//                .ignoreFailedDrops(true)
//                .addScript("schema.sql")
//                .addScripts("user_data.sql", "country_data.sql")
//                .build();
//    }
}


class Holder {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
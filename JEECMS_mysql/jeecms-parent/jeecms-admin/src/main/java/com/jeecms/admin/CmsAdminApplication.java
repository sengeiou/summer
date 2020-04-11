package com.jeecms.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;

import com.jeecms.common.configuration.ContextConfig;
import com.jeecms.common.configuration.WebConfig;

@Configuration
@EnableAutoConfiguration(exclude = {JmxAutoConfiguration.class, ElasticsearchAutoConfiguration.class,
        ElasticsearchDataAutoConfiguration.class, FreeMarkerAutoConfiguration.class})
@Import({ContextConfig.class, WebConfig.class})
@PropertySource({"classpath:config/spring.jpa.properties"})
@ImportResource({"classpath:config/**/context*.xml"})
@EnableTransactionManagement
public class CmsAdminApplication extends SpringBootServletInitializer {

    static Logger logger = LoggerFactory.getLogger(CmsAdminApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return configureApplication(builder);
    }

    public static void main(String[] args) throws Exception {
        configureApplication(new SpringApplicationBuilder()).run(args);
    }

    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
        return builder
                .sources(CmsAdminApplication.class)
//                .listeners(new ApplicationListener<ApplicationEnvironmentPreparedEvent>() {
//                    // 在应用环境准备好后执行（Application.properties和PoropertySource已读取），
//                    // 此时BeanFactory还未准备好（Bean还未创建）
//                    @SuppressWarnings("unused")
//                    @Override
//                    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
//                        ConfigurableEnvironment env = event.getEnvironment();
//                        // 用配置文件中的内容覆盖替代Constants的内容
//                         Constants.loadEnvironment(env);
//                    }
//                })
                ;
    }
}

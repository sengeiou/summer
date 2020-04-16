package com.summer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.DenyAllPermissionEvaluator;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.acls.AclPermissionEvaluator;
import org.springframework.security.acls.jdbc.JdbcMutableAclService;
import org.springframework.security.acls.jdbc.LookupStrategy;
import org.springframework.security.acls.model.AclCache;
import org.springframework.security.acls.model.AclService;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

import javax.sql.DataSource;

@Configuration(proxyBeanMethods = false)
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {

    // instance fields
    // =================================================================================

    private MethodSecurityExpressionHandler expressionHandler;

    // constructors
    // =================================================================================

    @Autowired
    public MethodSecurityConfig(MethodSecurityExpressionHandler expressionHandler) {
        this.expressionHandler = expressionHandler;
    }

    // methods
    // =================================================================================

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        return expressionHandler;
    }

    // beans
    // ===========================================================================================================

    private static final String ROLE_HIERARCHY_STRING_REPRESENTATION = "ROLE_ADMIN > ROLE_USER";

    @Bean
    public static DefaultMethodSecurityExpressionHandler methodSecurityExpressionHandler(AclService aclService) {
        AclPermissionEvaluator evaluator = new AclPermissionEvaluator(aclService);

        RoleHierarchyImpl hierarchy = new RoleHierarchyImpl();
        hierarchy.setHierarchy(ROLE_HIERARCHY_STRING_REPRESENTATION);

        DefaultMethodSecurityExpressionHandler expressionHandler = new DefaultMethodSecurityExpressionHandler();
        expressionHandler.setPermissionEvaluator(evaluator);
        expressionHandler.setRoleHierarchy(hierarchy);
        return expressionHandler;
    }

    @Bean
    public static JdbcMutableAclService aclService(
            DataSource dataSource, LookupStrategy lookupStrategy, AclCache aclCache) {
        return new JdbcMutableAclService(dataSource, lookupStrategy, aclCache);
    }
}

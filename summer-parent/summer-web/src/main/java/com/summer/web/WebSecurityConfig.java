//package com.summer.web;
//
//import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.core.io.Resource;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.core.DelegatingOAuth2TokenValidator;
//import org.springframework.security.oauth2.jwt.*;

//import java.security.KeyFactory;
//import java.security.interfaces.RSAPublicKey;
//import java.security.spec.X509EncodedKeySpec;
//import java.time.Duration;
//import java.util.Arrays;
//import java.util.Base64;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
//    @Bean
//    public static CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration config = new CorsConfiguration();
//        config.addAllowedOrigin("*");
//        config.setAllowedMethods(Arrays.asList("GET", "POST", "PATCH", "PUT", "DELETE"));
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//        return source;
//    }
//
//    @Configuration
//    @Order(1)
//    public static class AuthSecurityConfig extends WebSecurityConfigurerAdapter {
//
//        private UserDetailsService userDetailsService;
//        private PasswordEncoder passwordEncoder;
//        private CorsConfigurationSource corsConfigSource;
//
//        @Autowired
//        public AuthSecurityConfig(
//                UserDetailsService userDetailsService,
//                PasswordEncoder passwordEncoder,
//                CorsConfigurationSource corsConfigSource) {
//            this.userDetailsService = userDetailsService;
//            this.passwordEncoder = passwordEncoder;
//            this.corsConfigSource = corsConfigSource;
//        }
//
//        @Override
//        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//            auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
//        }
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.antMatcher("/auth/**")
//                    .cors().configurationSource(corsConfigSource)
//                    .and()
//                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                    .and()
//                    .csrf().disable()
//                    .logout().logoutUrl("/auth/logout")
//                    .and()
//                    .rememberMe().alwaysRemember(true)
//                    .and()
//                    .httpBasic()
//                    .and()
//                    .authorizeRequests()
//                    //.expressionHandler(expressionHandler)
//                    .antMatchers("/auth/**").authenticated();
//        }
//
//        @Bean
//        public static BCryptPasswordEncoder passwordEncoder() {
//            return new BCryptPasswordEncoder();
//        }
//
//        /*
//        @Bean
//        public SecurityExpressionHandler<FilterInvocation> webSecurityExpressionHandler() {
//            DefaultWebSecurityExpressionHandler expressionHandler = new DefaultWebSecurityExpressionHandler();
//            expressionHandler.setRoleHierarchy(roleHierarchy);
//            return expressionHandler;
//        }
//         */
//    }
//
//    @Configuration
//    @Order(2)
//    public static class oAuth2SecurityConfig extends WebSecurityConfigurerAdapter {
//
//        private JwtDecoder jwtDecoder;
//        private CorsConfigurationSource corsConfigSource;
//
//        @Autowired
//        public oAuth2SecurityConfig(JwtDecoder jwtDecoder, CorsConfigurationSource corsConfigSource) {
//            this.jwtDecoder = jwtDecoder;
//            this.corsConfigSource = corsConfigSource;
//        }
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .cors().configurationSource(corsConfigSource)
//                    .and()
//                    .csrf().disable()
//                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                    .and()
//                    .oauth2ResourceServer().jwt(jwt -> jwt.decoder(jwtDecoder))
//                    .and()
//                    .authorizeRequests().anyRequest().authenticated();
//        }
//
//        @Bean
//        public static NimbusJwtDecoder jwtDecoder(OAuth2ResourceServerProperties.Jwt props) throws Exception {
//            RSAPublicKey publicKey = (RSAPublicKey) KeyFactory.getInstance("RSA")
//                    .generatePublic(new X509EncodedKeySpec(getKeySpec(props.readPublicKey())));
//
//            DelegatingOAuth2TokenValidator<Jwt> validator = new DelegatingOAuth2TokenValidator<>(
//                    new JwtTimestampValidator(Duration.ofSeconds(30)),
//                    new JwtIssuerValidator(props.getIssuerUri()));
//
//            NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withPublicKey(publicKey).build();
//            //.withSecretKey(secretKey).macAlgorithm( ).build();
//            jwtDecoder.setJwtValidator(validator);
//            return jwtDecoder;
//        }
//
//        @Bean
//        public static OAuth2ResourceServerProperties.Jwt oAuth2ResourceServerPropertiesJwt(
//                @Value("spring.security.oauth2.resourceserver.jwt.issuerUri") String issuerUri,
//                @Value("spring.security.oauth2.resourceserver.jwt.jws-algoirthm") String jwsAlgorithm,
//                @Value("spring.security.oauth2.resourceserver.jwt.public-key-location") Resource publicKeyLocation) {
//            OAuth2ResourceServerProperties.Jwt jwt = new OAuth2ResourceServerProperties.Jwt();
//            jwt.setIssuerUri(issuerUri);
//            jwt.setJwsAlgorithm(jwsAlgorithm);
//            jwt.setPublicKeyLocation(publicKeyLocation);
//            return jwt;
//        }
//
//        /*
//        @Bean
//        public SecretKey secretKey() {
//            //byte[] key = Base64.getDecoder().decode("Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E=");
//            byte[] key = KeyGenerators.secureRandom(32).generateKey();
//            return new SecretKeySpec(key, "HS256");
//        }
//         */
//
//        private static byte[] getKeySpec(String keyValue) {
//            keyValue = keyValue.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
//            return Base64.getMimeDecoder().decode(keyValue);
//        }
//    }
//}

package com.summer.utils;

import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.jwk.RSAKey;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;
import java.security.KeyStore;

public class JwkTest {

    @Test
    public void testJwk() throws Exception {
        System.out.println("HelloWorld");
        Resource resource = new ClassPathResource("keystore.p12");

        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(resource.getInputStream(), "storepass".toCharArray());

        RSAKey jwk = RSAKey.load(keyStore,  "mykey", "storepass".toCharArray());

        System.out.println(jwk.toJSONObject().toJSONString());
        System.out.println(jwk.toPublicJWK().toJSONString());
//        String jwk = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
//        this.jwsSigner = new RSASSASigner(RSAKey.parse(jwk));
//        assert 1 == 1;

        Resource jwkLocation = new ClassPathResource("jwk.json");
        String jwkString = StreamUtils.copyToString(jwkLocation.getInputStream(), StandardCharsets.UTF_8);
        JWSSigner jwsSigner = new RSASSASigner(RSAKey.parse(jwkString));
        System.out.println(jwkString);
        System.out.println(jwsSigner);
    }
}

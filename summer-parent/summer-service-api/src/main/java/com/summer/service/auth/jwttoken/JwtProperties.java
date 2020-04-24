package com.summer.service.auth.jwttoken;

import com.nimbusds.jose.JWSAlgorithm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class JwtProperties {

    @Value("${summer.auth.jwt.validity-seconds}")
    private long validitySeconds;
    @Value("${summer.auth.jwt.issuer-uri}")
    private String issuerUri;
    @Value("${summer.auth.jwt.jws-algorithm}")
    private JWSAlgorithm jwsAlgorithm;
    @Value("${summer.auth.jwt.jwk-location}")
    private Resource jwkLocation;

    public long getValiditySeconds() {
        return validitySeconds;
    }

    public void setValiditySeconds(long validitySeconds) {
        this.validitySeconds = validitySeconds;
    }

    public String getIssuerUri() {
        return issuerUri;
    }

    public void setIssuerUri(String issuerUri) {
        this.issuerUri = issuerUri;
    }

    public JWSAlgorithm getJwsAlgorithm() {
        return jwsAlgorithm;
    }

    public void setJwsAlgorithm(JWSAlgorithm jwsAlgorithm) {
        this.jwsAlgorithm = jwsAlgorithm;
    }

    public Resource getJwkLocation() {
        return jwkLocation;
    }

    public void setJwkLocation(Resource jwkLocation) {
        this.jwkLocation = jwkLocation;
    }
}

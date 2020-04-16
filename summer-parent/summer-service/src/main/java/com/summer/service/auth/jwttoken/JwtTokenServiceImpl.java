package com.summer.service.auth.jwttoken;

import com.summer.service.auth.userdetails.UserDetailsImpl;
import com.summer.service.org.user.UserPassQueryDto;

import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.stream.Collectors;

@Service
public class JwtTokenServiceImpl implements JwtTokenService {

    private long validitySeconds;
    private String issuerUri;
    private JWSSigner jwsSigner;
    private JWSHeader jwsHeader;

    @Autowired
    public JwtTokenServiceImpl(JwtProps jwtProps) throws Exception {
        this.validitySeconds = jwtProps.getValiditySeconds();
        this.issuerUri = jwtProps.getIssuerUri();

        this.jwsHeader = new JWSHeader.Builder(jwtProps.getJwsAlgorithm()).build();

        String jwk = StreamUtils.copyToString(jwtProps.getJwkLocation().getInputStream(), StandardCharsets.UTF_8);
        this.jwsSigner = new RSASSASigner(RSAKey.parse(jwk));
    }

    @Override
    public String getToken() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserPassQueryDto user = ((UserDetailsImpl) auth.getPrincipal()).getUser();

        try {
            long currentTime = new Date().getTime();
            long expirationTime = currentTime + validitySeconds * 1000;
            String scopes = user.getRoles().stream()
                    .flatMap(role -> role.getScopes().stream())
                    .map(scope -> scope.getPermission() + ":" + scope.getTarget().toUpperCase())
                    .distinct()
                    .collect(Collectors.joining(" "));

            JWTClaimsSet claims = new JWTClaimsSet.Builder()
                    .issuer(issuerUri)
                    .issueTime(new Date(currentTime))
                    .notBeforeTime(new Date(currentTime))
                    .expirationTime(new Date(expirationTime))
                    .subject(user.getUsername())
                    .claim("userid", user.getId())
                    .claim("scp", scopes)
                    .build();

            SignedJWT signedJWT = new SignedJWT(jwsHeader, claims);
            signedJWT.sign(jwsSigner);
            return signedJWT.serialize();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

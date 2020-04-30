package com.summer.netty.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AbstractNotFoundException extends ResponseStatusException {

    public AbstractNotFoundException(String reason) {
        super(HttpStatus.NOT_FOUND, reason);
    }
}

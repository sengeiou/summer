package com.summer.service.org.scope;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ScopeDaoMixinImpl {

    @PersistenceContext
    private EntityManager em;
}

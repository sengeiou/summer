package com.springcms.service.org.role;

import java.util.Collections;
import java.util.Set;

public class RoleUpdateDto {

    Set<Authority> authorities = Collections.singleton(Authority.READ_STUFF);
}

package com.summer.web;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitConfig({RootConfig.class})
@ActiveProfiles("test")
public class RootConfigTest {
}

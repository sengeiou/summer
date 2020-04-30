package com.summer.war;

import org.junit.runner.RunWith;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {RootConfig.class, TestConfig.class})
@WebAppConfiguration
@ActiveProfiles("test")
public abstract class RootConfigTest {



}

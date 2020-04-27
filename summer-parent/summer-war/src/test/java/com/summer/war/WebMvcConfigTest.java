package com.summer.war;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.WebApplicationContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

@ContextHierarchy(@ContextConfiguration(classes = WebMvcConfig.class))
public class WebMvcConfigTest extends RootConfigTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockHttpServletRequest mockRequest;


    @Autowired
    private Holder holder;

    @Test
    public void testWeb() {
        System.out.println("---------------");
        System.out.println(wac);
        System.out.println("---------------");
        for (String name : wac.getBeanDefinitionNames())
            System.out.println(name);

        System.out.println("------------------rooooooot----------------------");

        WebApplicationContext parent = (WebApplicationContext) wac.getParent();
        System.out.println(parent);

        System.out.println("---------------");

        for (String name : parent.getBeanDefinitionNames())
            System.out.println(name);
        System.out.println("---------------");


        System.out.println(mockRequest.getClass());

        //System.out.println(holder);

        System.out.println("yyyyyyyyyyyyyyy");
        mockRequest.setParameter("shit","jfoo");
        System.out.println("zzzzzzzzzzzzzz");

        System.out.println("111111111111");
        System.out.println(holder == null);
        System.out.println("2222222222222");
        System.out.println(holder.getValue());

//        System.out.println(holder);
//
//        mockRequest.setParameter("shit","jfoo");
//
//        System.out.println(holder.getValue());
//        System.out.println(holder);
//
//        mockRequest.setParameter("shit","boo");
//
//        System.out.println(holder.getValue());
//        System.out.println(holder);
    }

    @Test
    public void testDD() {
        System.out.println("333333333333");
        System.out.println(holder == null);
        System.out.println("444444444444444");

        System.out.println("xxxxxxxxxxxxxxx");
        mockRequest.setParameter("shit","dfsdffoo");
        System.out.println(holder.getValue());
    }
}

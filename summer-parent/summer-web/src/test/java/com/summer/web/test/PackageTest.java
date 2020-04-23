package com.summer.web.test;

import org.junit.Test;

public class PackageTest {


    @Test
    public void test() {
        System.out.println(Integer.class.getPackage().getName());
    }
}

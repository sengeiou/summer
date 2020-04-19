package com.summer.web.test;

import org.junit.Test;

public class InterfaceTest {

    private int x = 1;

    @Test
    public void test() {
        //int x = 1;
        A a = ()->{return x;};
        x = 2;
        System.out.println(a.number());
        x = 3;
        System.out.println(a.number());
        System.out.println(a.getClass());
    }

    public interface A {
        int number();
    }
}

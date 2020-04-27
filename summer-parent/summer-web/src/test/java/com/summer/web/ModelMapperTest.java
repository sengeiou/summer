package com.summer.web;

import org.junit.Test;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModelMapperTest {

    @Test
    public void test() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.typeMap(A.class, B.class).addMappings(mapper -> {
            mapper.map(src -> null, B::setB);
        });

        A a = new A("a","b");
        List<C> listC = new ArrayList<C>();
        C c = new C("1","2");
        listC.add(c);
        listC.add(c);
        listC.add(c);
        a.setListC(listC);

        B b = modelMapper.map(a, B.class);
        System.out.println(b);


        AI ai = new AI() {
            @Override
            public String getA() {
                return "sfadsfasfasfa";
            }
        };

        b = modelMapper.map(ai, B.class);
        System.out.println(b);


    }

}

class A {
    private String a;
    private String b;
    private List<C> listC;

    public A(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<C> getListC() {
        return listC;
    }

    public void setListC(List<C> listC) {
        this.listC = listC;
    }
}

class B {
    private String a;
    private String b;
    private Set<D> listC;

    @Override
    public String toString() {
        return "B{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", listC=" + listC +
                '}';
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Set<D> getListC() {
        return listC;
    }

    public void setListC(Set<D> listC) {
        this.listC = listC;
    }
}

interface AI {
    String getA();
}

class C {
    private String x;
    private String y;

    public C(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "C{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
class D {
    private String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "D{" +
                "x='" + x + '\'' +
                '}';
    }
}
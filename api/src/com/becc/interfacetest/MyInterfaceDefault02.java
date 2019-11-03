package com.becc.interfacetest;

public class MyInterfaceDefault02 implements MyInterfaceDefault {
    @Override
    public void method01() {
        System.out.println("myInterfaceDefault 02");
    }

    @Override
    public void method02() {
        System.out.println("这个默认方法被重写了,这个方法来自于"+MyInterfaceDefault.class.getName());
    }
}

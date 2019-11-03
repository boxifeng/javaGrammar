package com.becc.interfacetest;

public class Test02 {
    public static void main(String[] args) {
        MyInterfaceDefault01 default01 = new MyInterfaceDefault01();
        default01.method01();
        default01.method02();

        MyInterfaceDefault02 default02 = new MyInterfaceDefault02();
        default02.method01();
        default02.method02();
    }
}

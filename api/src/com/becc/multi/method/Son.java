package com.becc.multi.method;

public class Son extends Father {
    String s = "子类成员变量";
    int age = 29;

    @Override
    void method() {
        System.out.println("子类重写");
    }
    void methodSon(){
        System.out.println("子类特有");
    }
}

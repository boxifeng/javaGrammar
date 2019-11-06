package com.becc.multi.method;

public class Father {
    String s = "父类成员变量";

    void method(){
        System.out.println("父类方法");
    }
    void methodFather(){
        System.out.println("父类特有");
    }
}

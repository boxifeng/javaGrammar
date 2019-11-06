package com.becc.multi.variable;

public class Son extends Father {
    String s = "子类成员变量";
    int age = 29;
    @Override
    void showS(){
        System.out.println(s);
    }
}

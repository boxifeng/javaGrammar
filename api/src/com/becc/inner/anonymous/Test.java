package com.becc.inner.anonymous;

/**
 * 匿名内部类注意事项
 * 1、匿名内部类，在创建对象的时候，只能使用唯一一次
 * 2、
 */
public class Test {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法");
            }
        };
        myInterface.method();
    }
}

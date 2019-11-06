package com.becc.multi.variable;

/**
 * 访问成员变量的两种形式
 * 1、直接通过对象名称访问成员变量:看=左边是谁优先用谁，没有就向上找
 * 2、间接通过成员方法访问成员变量:该方法属于谁，优先用谁 ，没有向上找
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.s);
//        father.age; 错误写法 只会向上找即object类 而不会去子类（son类 ）中找
        /**
         * 子类没有覆盖重写就是父类
         * 覆盖重写了就是子
         */
        father.showS();
    }
}

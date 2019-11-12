package com.becc.inner;

/**
 * 如何使用内部类
 * 1、间接方式：在外部类的方法中调用内部类，然后通过调用外部类方法间接使用内部类
 * 2、直接方式：外部类名称.内部类名称 对象名 = new 外部类().new 内部类()
 */
public class Test {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();

        System.out.println("=========================");
        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}

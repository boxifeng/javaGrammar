package com.becc.collection.demo.generic;

/**
 * 定义一个含有泛型的类
 */
public class GenericDemo01 {
    /**
     * 成员泛型方法
     *
     * @param t
     * @param <T>
     */
    public <T> void method01(T t) {
        System.out.println(t);
    }

    public static <T> void method(T t) {
        System.out.println(t.getClass());
    }
}

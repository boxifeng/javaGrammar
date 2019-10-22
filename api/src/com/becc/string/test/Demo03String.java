package com.becc.string.test;

/**
 * 1、 对于引用类型来说，==进行的是内存地址的比较
 * 2、对于双引号直接声明的String对象来说，在字符串常量池当中即堆当中，
 * 在常量池中数值相同的使用相同的内存地址用来节省内存。
 * 3、其他形式声明的String对象，不在常量池当中
 */
public class Demo03String {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        char[] cArray = {'a', 'b', 'c'};
        String s3 = new String(cArray);
        String s4 = new String(cArray);
        byte[] bArray = {97, 98, 99};
        String s5 = new String(bArray);
        String s6 = new String(bArray);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println(s1 == s5);
    }
}

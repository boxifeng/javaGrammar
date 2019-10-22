package com.becc.string.test;



/**
 * 1、String是不可变得
 * 2、String可以看做是一个char[]，但是String的底层实现原理是byte[]
 * 3、String常见的4种创建方式
 *      3.1、无参构造 public String(){};
 *      3.2、char数组构造public String(char[]){}
 *      3.3、byte数组构造public String(byte[]){}
 *      3.4、最常见的直接双引号String a = "";
 */
public class Demo01String {
    public static void main(String[] args) {
        String s1 = new String();
        char[] charArray = {'A','B','C'};
        String s2 = new String(charArray);
        byte[] byteArray = {97, 98, 99};
        String s3 = new String(byteArray);
        String s4 = "aaaa";
        String s5 = new String(charArray);
        String s6 = new String(byteArray);

        System.out.println(s2 == s5);
        System.out.println(s3 == s6);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}

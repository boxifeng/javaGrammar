package com.becc.string.test;


/**
 * 1、比较字符串使用equals方法（是区大小写的）
 * 2、第二种方法使用
 */
public class Demo04String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        String str4 = "ABC";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}

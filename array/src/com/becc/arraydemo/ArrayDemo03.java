package com.becc.arraydemo;

/**
 * 1、获取数组长度的方法是array.length
 * 2、数组的长度在程序开始运行时就确定了不会发生改变，
 * demo array01中长度发生变化是因为先后赋值了两个不同的数组
 * 3、遍历数组元素的常用方法
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,11,44,66,777,888,999,444,333};
        System.out.println(array.length);

        int[] array01 = new int[3];
        System.out.println("array01的长度为"+array01.length);
        array01 = new int[6];
        System.out.println("array01的长度为"+array01.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

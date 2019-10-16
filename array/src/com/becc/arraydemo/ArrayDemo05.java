package com.becc.arraydemo;

import java.util.Arrays;

/**
 *反转一个数组(任意引用类型)
 */
public class ArrayDemo05 {
    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44, 66, 777, 888, 999};
        String[] StringArray = new String []{"1111","2222","333","4444","666"};
        Integer[] integers = reverseArray(array);
        String[] strings = reverseArray(StringArray);
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(strings));

    }

    /**
     * 反转方法
     * @param array
     * @param <T>
     * @return
     */
    public static <T>T[] reverseArray(T[] array){
        T[] objectArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            objectArray[array.length - (i+1)] = array[i];
        }
        return objectArray;
    }
}

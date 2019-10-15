package com.becc.arraydemo;

/**
 *反转一个数组(任意类型)
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44, 66, 777, 888, 999};
        Object[] objects = reverseArray(array);
    }
    public static <T>T reverseArray(T[] array){
        Object[] objectArray = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            objectArray[array.length - (i+1)] = array[i];
        }
        return (T) objectArray;
    }
}

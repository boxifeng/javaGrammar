package com.becc.arraydemo;

import java.util.Arrays;

/**
 * 反转一个数组(任意引用类型)
 */
public class ArrayDemo05 {
    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44, 66, 777, 888, 999};
        String[] StringArray = new String[]{"张三", "李四", "王五", "赵六", "孙七"};
        reverseArray(array);
        reverseArray(StringArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(StringArray));

    }

    /**
     * 反转方法(将原数组反转,支持任意引用类型数组)
     *
     * @param array - 任意引用类型数组
     * @param <T>
     * @return
     */
    public static <T> void reverseArray(T[] array) {
        T[] objectArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            objectArray[array.length - (i + 1)] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = objectArray[i];
        }

    }
}

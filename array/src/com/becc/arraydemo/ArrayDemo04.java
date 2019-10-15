package com.becc.arraydemo;

/**
 * 写一个获取数组中最大元素的方法
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44, 66, 777, 888, 999, 444, 333};
        System.out.println("array数组中的最大值为" + getMaxInArray(array));
    }

    /**
     * 获取int数组中最大的元素
     * @param array
     * @return
     */
    public static int getMaxInArray(int[] array) {
        int[] arrayRes = new int[]{array[0]};
        for (int i = 0; i < array.length; i++) {
            if (arrayRes[0] < array[i]) {
                arrayRes[0] = array[i];
            }
        }
        return arrayRes[0];
    }

}

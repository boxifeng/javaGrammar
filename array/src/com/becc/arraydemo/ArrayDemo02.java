package com.becc.arraydemo;


/*
这个demo证明 当一个数组A赋值给数组B时，B与A共
用相同的内存地址，所以当B的值发生改变时A的值也相应改变
即A和B是同一个数组
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        intArray[0] = 20;
        intArray[1] = 50;
        intArray[2] = 90;

        System.out.println("++++++++++++++++++++++++++++");

        int[] intArraySame = intArray;
        System.out.println(intArraySame[0]);
        System.out.println(intArraySame[1]);
        System.out.println(intArraySame[2]);
        System.out.println("++++++++++++++++++++++++++++");
        intArraySame[0] = 200;
        intArraySame[1] = 300;
        intArraySame[2] = 400;


        System.out.println(intArraySame[0]);
        System.out.println(intArraySame[1]);
        System.out.println(intArraySame[2]);
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
    }
}

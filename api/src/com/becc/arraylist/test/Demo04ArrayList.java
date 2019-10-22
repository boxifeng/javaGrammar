package com.becc.arraylist.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * 定义一个集合A存入20个随机数字（1到200之间），筛选后将偶数集合放入集合B
 * 要求使用自定义方法进行筛选
 */
public class Demo04ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(r.nextInt(200) + 1);
        }
        System.out.println(arrayList);
        System.out.println(screen(arrayList));
    }

    public static ArrayList<Integer> screen(ArrayList<Integer> arrayList) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer integer = arrayList.get(i);
            if (integer % 2 == 0) {
                integers.add(integer);
            }
        }
        return integers;
    }
}

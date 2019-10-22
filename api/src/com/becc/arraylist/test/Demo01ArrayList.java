package com.becc.arraylist.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * 1、数组的长度是不可变的，而ArrayList是可变的
 * 2、对于ArrayList来说<E>代表泛型，可以约束放入的元素为统一约定好的类型
 * 3、泛型只能为引用类型，不能是基本类型
 * 4、生成6个1到35之间的随机数，装到一个集合中，并且遍历集合
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomInt = random.nextInt(35) + 1;
            Integer integer = new Integer(randomInt);
            integerList.add(integer);
        }
        System.out.println(integerList);
        for (Integer j : integerList) {
            System.out.println(j);
        }
    }
}

package com.becc.arraylist.test;

import java.util.ArrayList;

/**
 * 写一个方法，参数是arraylist<>,打印这个集合，格式是使用{}括起集合，用@分割
 */
public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("张三");
        stringArrayList.add("立式");
        stringArrayList.add("网红");
        stringArrayList.add("余生");
        printArrayList(stringArrayList);
    }

    public static void printArrayList(ArrayList arrayList){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < arrayList.size() - 1; i++) {
            sb.append(arrayList.get(i)+"@");
        }
        sb.append(arrayList.get(arrayList.size()-1));
        sb.append("}");
        System.out.println(sb);
    }
}

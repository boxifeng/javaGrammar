package com.becc.collection.demo.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator接口 ：迭代器接口(对集合进行遍历)
 * 常用方法
 * 1、hasNext();判断有没有下一个元素
 * 2、next();取出下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> collections = new ArrayList<>();
        collections.add("张三");
        collections.add("李四");
        collections.add("王五");
        collections.add("赵六");
        collections.add("孙七");
        System.out.println(collections);
        Iterator<String> iterator = collections.iterator();
        Iterator<String> iterator2 = collections.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(collections);
        System.out.println(iterator2.next());
    }
}

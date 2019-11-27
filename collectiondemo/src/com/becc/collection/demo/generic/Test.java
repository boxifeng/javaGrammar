package com.becc.collection.demo.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        GenericDemo01 generic = new GenericDemo01();
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        generic.method01(1);
        generic.method01(list);
        GenericDemo01.method(list);
        GenericDemo01.method(1);

    }
}

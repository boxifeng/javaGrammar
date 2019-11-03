package com.becc.statictest;

import com.becc.arraylist.DO.Employee;
import com.becc.arraylist.DO.Teacher;

/**
 * 如果一个成员变量使用了static关键字修饰，那这个变量将不再属于对象，
 * 而是属于这个class，
 * 多个对象共同使用，共享同一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Teacher teacher = new Teacher();
        System.out.println(teacher.toString());
        teacher.setAge(20);
        teacher.setName("sdsss");
        System.out.println(teacher.toString());
        System.out.println(employee);
    }
}

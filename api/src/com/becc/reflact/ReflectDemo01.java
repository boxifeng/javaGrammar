package com.becc.reflact;

/**
 * Classname:ReflectDemo01
 * package:com.becc.reflact
 * Description:
 * DATE:2020/4/21  17:29
 * Author:boxifeng
 */
public class ReflectDemo01 {
    /**
     * 获Class对象的三种方式
     * 1、Class.forName();
     * 2、类名.Class;
     * 3、对象.getClass
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //1、class.forName
        Class c1 = Class.forName("com.becc.reflact.Person");
        System.out.println(c1);
        //2、类名.class
        Class c2 = Person.class;
        System.out.println(c2);
        //3、对象.getClass
        Person person = new Person();
        Class c3 = person.getClass();
        System.out.println(c3);


        System.out.println(c1 == c2);//true
        System.out.println(c2 == c3);//true


        //结论 一个class文件，只加载一次生成一个class对象






    }
}

package com.becc.arraylist.test;

import com.becc.arraylist.DO.Student;

import java.util.ArrayList;

/**
 * 自定义4个学生类，并添加到集合里面，并遍历集合
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        Student studentOne = new Student(27,"张三");
        Student studentTwo = new Student(28,"李四");
        Student studentThree = new Student(29,"王五");
        Student studentFour = new Student();
        studentFour.setAge(40);
        studentFour.setName("赵六");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);
        for (int i = 0; i < studentList.size() ; i++) {
            System.out.println("学生的年龄是"+studentList.get(i).getAge()+",学生的姓名是"+studentList.get(i).getName());
        }

    }
}

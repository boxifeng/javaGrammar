package com.becc.arraylist.DO;

public class Employee {
    int age = 200;
    String name = "员工";

    public Employee() {
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

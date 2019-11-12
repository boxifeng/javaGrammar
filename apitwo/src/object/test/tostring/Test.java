package object.test.tostring;

import object.test.equals.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(null instanceof Person);
    }
}

package com.study.encapsulation;

/**
 * ClassName: PersonTest
 * Package: com.study.encapsulation
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 15:02
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        System.out.println(person.getAge());
    }
}

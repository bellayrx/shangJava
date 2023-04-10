package com.study.method.example;


/**
 * ClassName: PersonTest
 * Package: com.study.method.example
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/10 21:17
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tom";
        p1.age = 12;
        p1.gender = '男';
        p1.study();
        System.out.println(p1.showAge());//通过方法调用age，不建议直接调用age
        p1.addAge(2);
        System.out.println(p1.showAge());
        Person p2 = new Person();
        System.out.println(p2.age);
        p2.addAge(10);
        System.out.println(p2.showAge());
    }
}

package com.study.polymorphism.exer3;

/**
 * ClassName: Person
 * Package: com.study.polymorphism.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 11:17
 * @Version 1.0
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

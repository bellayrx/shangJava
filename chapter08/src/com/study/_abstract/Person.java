package com.study._abstract;

/**
 * ClassName: Person
 * Package: com.study._abstract
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/29 11:24
 * @Version 1.0
 */
public abstract class Person extends Creature {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();//此方法是抽象方法，这里的重写叫实现

    public abstract void sleep();
}

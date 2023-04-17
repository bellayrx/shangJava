package com.study._super;

/**
 * ClassName: Person
 * Package: com.study.inherient
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 12:41
 * @Version 1.0
 */
public class Person {
    int id = 1001;
    private String name;
    private int age;

    public Person() {
        System.out.println("Person.....");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void doSport() {
        System.out.println("人做运动");
    }
}

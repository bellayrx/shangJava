package com.study.thisstudy;

/**
 * ClassName: PersonTest
 * Package: com.study.thisstudy
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/14 11:01
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(100);
        System.out.println(p1.getAge());
        Person p2 = new Person("www", "10");
        System.out.println(p2.getEmail() + "\t" + p2.getName());
        p2.eat();
    }
}

class Person {
    private String name;
    private int age;
    private String email;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
        this.sleep();
    }

    public void sleep() {
        System.out.println("人睡觉");

    }
}
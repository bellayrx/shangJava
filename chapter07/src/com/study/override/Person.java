package com.study.override;

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
    private String name;
    private int age;

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
}

package com.study.thisstudy.exer;

/**
 * ClassName: Boy
 * Package: com.study.thisstudy.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/14 11:35
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Gril gril) {
        System.out.println("我想娶" + gril.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("可以结婚");
        } else {
            System.out.println("不可以结婚");
        }
    }
}

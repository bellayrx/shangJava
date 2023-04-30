package com.study._abstract;

/**
 * ClassName: Student
 * Package: com.study._abstract
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/29 11:26
 * @Version 1.0
 */
public class Student extends Person {
    String school;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生吃好");
    }

    @Override
    public void sleep() {
        System.out.println("学生多睡觉");
    }

    @Override
    public void breath() {
        System.out.println("学生呼吸");
    }
}

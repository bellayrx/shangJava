package com.study.override;

/**
 * ClassName: Student
 * Package: com.study.inherient
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 12:42
 * @Version 1.0
 */
public class Student extends Person {
    private String school;

    public void study() {
        System.out.println("学习");
    }

    @Override
    public void eat() {
        System.out.println("学生吃有营养的饭");
    }

    public void shou() {
        System.out.println("age=" + getAge());
    }

    @Override
    public void sleep() {
        System.out.println("student ==睡觉");
    }
}

package com.study.polymorphism.exer3;

/**
 * ClassName: Student
 * Package: com.study.polymorphism.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 11:17
 * @Version 1.0
 */
public class Student extends Person {
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

package com.study._super;

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
    int id = 1002;
    private String school;

    //测试super调用父类的构造器
    public Student() {
//        super();
        System.out.println("student...");
    }

    public Student(String school, int id) {
        this.school = school;
        this.id = id;
    }

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        eat();
        this.eat();
        super.eat();//不影响封装性为前提
        System.out.println(getAge());
    }

    @Override
    public void eat() {
        System.out.println("student吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("student睡觉");
    }

    public void show1() {
        this.doSport();
    }

    public void show2() {
        System.out.println("****************");
        System.out.println(id);
        System.out.println(super.id);

    }

    public void show3() {
        System.out.println("****************");
        System.out.println();
        System.out.println();

    }
}

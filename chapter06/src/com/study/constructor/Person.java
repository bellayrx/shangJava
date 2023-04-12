package com.study.constructor;

/**
 * ClassName: Person
 * Package: com.study.constructor
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 15:30
 * @Version 1.0
 */
public class Person {
    //属性
    String name;
    int age;

    //构造器
    public Person() {
        System.out.println("Person()....");
    }

    //声明其它的构造器
    public Person(int a) {
        age = a;
    }

    public Person(String n) {
        name = n;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep(int hour) {
        System.out.println("每天睡眠" + hour + "小时");
    }

}

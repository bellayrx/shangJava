package com.study.block;

/**
 * ClassName: BlockTest
 * Package: com.study.block
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/22 14:33
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        System.out.println(person.age);
        System.out.println(Person.info);
    }
}

class Person {
    static String info = "我是一个人";

    //静态代码块
    static {
        System.out.println("静态代码块1");
        System.out.println("info=" + info);
    }

    static {
        System.out.println("静态代码块2");
        System.out.println("info=" + info);
    }

    String name;
    int age;

    //非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }

    {
        System.out.println("非静态代码块2");
        age = 1;
    }

    public Person() {
        System.out.println("构造函数");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}

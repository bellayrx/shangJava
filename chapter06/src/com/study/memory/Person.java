package com.study.memory;

/**
 * ClassName: Person
 * Package: com.study.memory
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/9 23:45
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人每天至少保证" + hour + "小时睡眠");
    }

    public void interest(String hobby) {
        System.out.println("我的爱好是" + hobby);
    }
}

package com.study.memory;

/**
 * ClassName: PersonTest
 * Package: com.study.memory
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/9 23:48
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "杰克";
        p1.age = 24;
        p1.gender = '男';

        System.out.println("name=" + p1.name + ",age=" + p1.age + ",gender=" + p1.gender);
        p1.eat();
        p1.sleep(8);
        p1.interest("read");

        Person p2 = new Person();
        p2.name = "露丝";
        p2.age = 18;
        p2.gender = '女';
        System.out.println("name=" + p2.name + ",age=" + p2.age + ",gender=" + p2.gender);
        p2.eat();
        //属性是每个对象都有一份 这里p1不会显示p2的内容
        System.out.println("name=" + p1.name + ",age=" + p1.age + ",gender=" + p1.gender);
        Person p3 = p1;
        p3.age = 100;
        System.out.println("name=" + p1.name + ",age=" + p1.age + ",gender=" + p1.gender);

    }
}

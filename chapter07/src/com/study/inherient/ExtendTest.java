package com.study.inherient;

/**
 * ClassName: ExtendTest
 * Package: com.study.inherient
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 12:43
 * @Version 1.0
 */
public class ExtendTest {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        person.eat();
        student.eat();
        System.out.println(student.getClass().getSuperclass());//获取父类
        System.out.println(person.getClass().getSuperclass());//获取父类
    }
}

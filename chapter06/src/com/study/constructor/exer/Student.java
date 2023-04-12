package com.study.constructor.exer;

/**
 * ClassName: Student
 * Package: com.study.constructor.exer1
 * Description:
 * 案例：
 * (1)定义Student类,有4个属性：
 * String name;
 * int age;
 * String school;
 * String major;
 * <p>
 * (2)定义Student类的3个构造器:
 * <p>
 * - 第一个构造器Student(String n, int a)设置类的name和age属性；
 * - 第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
 * - 第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性；
 * <p>
 * (3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 *
 * @Author wkm
 * @Create 2023/4/12 16:20
 * @Version 1.0
 */
public class Student {
    String name;
    int age;
    String school;
    String major;//专业

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

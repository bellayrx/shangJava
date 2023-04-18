package com.study.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Package: com.study.polymorphism.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 11:07
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void method(Person e) {
        System.out.println(e.getInfo());
        if (e instanceof Graduate) {
            for (int i = 0; i < 3; i++) {
                System.out.println("a graduate");
            }
        } else if (e instanceof Student) {
            for (int i = 0; i < 2; i++) {
                System.out.println("a student");
            }
        } else {
            System.out.println("a person ");
        }
    }

}



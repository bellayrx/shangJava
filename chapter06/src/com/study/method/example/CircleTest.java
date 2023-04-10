package com.study.method.example;

/**
 * ClassName: CircleTest
 * Package: com.study.method.example
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/10 21:51
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2.3;
        System.out.println(circle.findArea());
//        System.out.println(circle.findArea(2.3));
    }
}

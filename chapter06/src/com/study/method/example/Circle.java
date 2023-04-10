package com.study.method.example;

/**
 * ClassName: Circle
 * Package: com.study.method.example
 * Description:
 * 案例：
 * <p>
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 *
 * @Author wkm
 * @Create 2023/4/10 21:49
 * @Version 1.0
 */
public class Circle {
    double PI = 3.14;
    double radius;

    public double findArea() {
        return PI * radius * radius;
    }

//    public double findArea(double area) {
//        return PI * area * area;
//    }
}

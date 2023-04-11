package com.study.method.more.valuetransfer.exer1;

/**
 * ClassName: Circle
 * Package: com.study.method.more.valuetransfer.exer1
 * Description:
 * 1. 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 *
 * @Author wkm
 * @Create 2023/4/11 15:42
 * @Version 1.0
 */
public class Circle {
    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }
}

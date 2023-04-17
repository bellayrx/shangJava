package com.study._super.exer2;

/**
 * ClassName: Circle
 * Package: com.study.inherient.exer2
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:43
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}

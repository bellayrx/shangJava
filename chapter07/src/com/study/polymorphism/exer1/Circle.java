package com.study.polymorphism.exer1;

/**
 * ClassName: Circle
 * Package: com.study.polymorphism.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 10:37
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String coler, double weight, double radius) {
        super(coler, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}

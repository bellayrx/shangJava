package com.study.polymorphism.exer1;

/**
 * ClassName: MyRectangle
 * Package: com.study.polymorphism.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 10:41
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(String coler, double weight, double width, double height) {
        super(coler, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}

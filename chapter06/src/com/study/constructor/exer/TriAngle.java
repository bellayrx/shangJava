package com.study.constructor.exer;

/**
 * ClassName: TriAngle
 * Package: com.study.constructor.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 16:26
 * @Version 1.0
 */
public class TriAngle {
    //属性
    private double base;//底边长
    private double height;//高

    public TriAngle() {

    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    //...

    //求面积的方法
    public double findArea() {
        return base * height / 2;
    }

}

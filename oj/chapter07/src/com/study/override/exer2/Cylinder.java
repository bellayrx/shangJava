package com.study.override.exer2;

/**
 * ClassName: Cylinder
 * Package: com.study.inherient.exer2
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:45
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 2.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    @Override
    public double findArea() {
        return 2 * super.findArea() + Math.PI * 2 * getRadius() * getLength();
    }


}

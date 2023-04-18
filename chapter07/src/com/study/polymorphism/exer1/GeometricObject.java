package com.study.polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.study.polymorphism.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 10:34
 * @Version 1.0
 */
public class GeometricObject {
    protected String coler;
    protected double weight;

    public GeometricObject() {
    }

    protected GeometricObject(String coler, double weight) {
        this.coler = coler;
        this.weight = weight;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}

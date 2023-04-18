package com.study.polymorphism.exer1;

/**
 * ClassName: GeometricTest
 * Package: com.study.polymorphism.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 10:42
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red", 1.0, 2.3);
        Circle c2 = new Circle("red", 3.0, 3.3);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        boolean b = test.equalArea(c1, c2);
        System.out.println(b);
    }

    /**
     * 面积是否相等
     *
     * @param g1 g1
     * @param g2 g2
     * @return boolean
     */
    public boolean equalArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g1) {
        System.out.println("几何图形的面积为：" + g1.findArea());//动态绑定（重写了）<---->静态绑定（编译和运行用的是同一个方法）
    }
}

package com.study.override.exer2;

/**
 * ClassName: CylinderTest
 * Package: com.study.inherient.exer2
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:46
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(1.4);
        cylinder.setRadius(2.3);
        System.out.println(cylinder.findArea());
        System.out.println(cylinder.findVolume());

    }
}

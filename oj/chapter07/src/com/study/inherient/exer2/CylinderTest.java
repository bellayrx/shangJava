package com.study.inherient.exer2;

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
        cylinder.setLength(10);
        cylinder.setRadius(10);
        System.out.println(cylinder.findVolume());

    }
}

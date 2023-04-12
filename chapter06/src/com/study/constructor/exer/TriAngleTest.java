package com.study.constructor.exer;

/**
 * ClassName: TriAngleTest
 * Package: com.study.constructor.exer
 * Description:
 * angle:角
 * angel:天使
 * <p>
 * 案例：
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 *
 * @Author wkm
 * @Create 2023/4/12 16:27
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        //创建TriAngle的实例1
        TriAngle t1 = new TriAngle();

        t1.setHeight(2.3);
        t1.setBase(3.4);

        System.out.println("面积为：" + t1.findArea());

        //创建TriAngle的实例2
        TriAngle t2 = new TriAngle(2.4, 4.5);

        System.out.println("底边长为：" + t2.getBase());
        System.out.println("高为：" + t2.getHeight());
        System.out.println("面积为：" + t2.findArea());
    }
}

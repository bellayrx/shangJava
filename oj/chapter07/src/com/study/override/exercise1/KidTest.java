package com.study.override.exercise1;

/**
 * ClassName: KidTest
 * Package: com.study.inherient.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:39
 * @Version 1.0
 */
public class KidTest {
    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.setSalary(100);
        kid.setSex(0);
        kid.setYearOld(12);
        kid.employeed();
        kid.manOrWomen();
        System.out.println(kid.getYearOld());
    }
}

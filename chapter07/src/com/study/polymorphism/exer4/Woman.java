package com.study.polymorphism.exer4;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:27
 * @Version 1.0
 */
public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("女人小口的吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人去女厕所");
    }

    public void makeup() {
        System.out.println("厕后补补妆");
    }
}

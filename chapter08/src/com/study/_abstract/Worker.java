package com.study._abstract;

/**
 * ClassName: Worker
 * Package: com.study._abstract
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/29 11:49
 * @Version 1.0
 */
public class Worker extends Person {
    @Override
    public void eat() {
        System.out.println("工人辛苦，多吃");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void breath() {
        System.out.println("工人多呼吸空气");
    }
}

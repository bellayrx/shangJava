package com.study.oop;

/**
 * ClassName: PhoneTest
 * Package: com.study.oop
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/9 23:24
 * @Version 1.0
 */
public class PhoneTest {//Phone的测试类

    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();
        //通过phone的对象调用其内部的属性或者方法
        p1.name = "huawei mate60";
        p1.price = 6699;
        System.out.println("name = " + p1.name + ",price=" + p1.price);
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}

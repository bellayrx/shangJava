package com.study.oop;

/**
 * ClassName: Phone
 * Package: com.study.oop
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/9 12:44
 * @Version 1.0
 */
public class Phone {
    //属性
    double price;
    String name;


    //方法
    public void call() {
        System.out.println("手机能够打电话");
    }

    public void sendMessage(String message) {
        System.out.println("手机能够发信息" + message);
    }

}

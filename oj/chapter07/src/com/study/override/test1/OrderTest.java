package com.study.override.test1;

/**
 * ClassName: OrderTest
 * Package: com.study.override.test1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 17:00
 * @Version 1.0
 */
public class OrderTest {
    public void method1(){
        Order order = new Order();
        order.orderProtected=1;
        order.orderDefault=1;
        order.orderPublic=1;
//        order.orderPrivate=1; 封装性影响 不能使用
        order.methodProtected();
        order.methodPublic();
        order.methodDefault();

    }
}

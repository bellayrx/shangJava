package com.study.override.test2;

import com.study.override.test1.Order;

/**
 * ClassName: OrderTest
 * Package: com.study.override.test2
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 17:07
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.methodPublic();
        order.orderPublic = 1;
        SubOrderTest subOrderTest = new SubOrderTest();
        subOrderTest.methodPublic();
        subOrderTest.show();
    }
}

package com.study.field;

/**
 * ClassName: FieldTest
 * Package: com.study.field
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/24 23:28
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}
class Order{

    int orderId = 1;

    {
        orderId = 2;
    }
    public Order() {
        orderId = 3;
    }
}
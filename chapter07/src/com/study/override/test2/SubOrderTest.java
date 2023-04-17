package com.study.override.test2;

import com.study.override.test1.Order;

/**
 * ClassName: OrderTest
 * Package: com.study.override.test2
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 17:03
 * @Version 1.0
 */
public class SubOrderTest extends Order {
    public void method() {
        orderPublic = 1;
        orderProtected = 1;
        methodProtected();
        methodPublic();
    }

}

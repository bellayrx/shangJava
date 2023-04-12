package com.study.encapsulation;

/**
 * ClassName: Order
 * Package: com.study.encapsulation
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 15:19
 * @Version 1.0
 */
public class Order {
    public int orderPublic;
    int orderDefault;
    //声明不同权限的属性
    private int orderPrivate;

    //声明不同权限的方法
    private void methodPrivate() {

    }

    void methodDefault() {

    }

    public void methodPublic() {

    }

    public void test() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }

}

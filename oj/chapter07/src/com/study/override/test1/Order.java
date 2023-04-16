package com.study.override.test1;

/**
 * ClassName: Order
 * Package: com.study.override.test1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:56
 * @Version 1.0
 */
public class Order {
    public int orderPublic;
    protected int orderProtected;
    int orderDefault;
    private int orderPrivate;

    private void methodPrivate() {
    }

    void methodDefault() {
    }

    protected void methodProtected() {
    }

    public void methodPublic() {
    }

    public void show() {
        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
        orderProtected = 1;
        orderDefault = 1;
        orderPublic = 1;
        orderPrivate = 1;
    }
}

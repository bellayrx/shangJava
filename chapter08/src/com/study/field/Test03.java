package com.study.field;

/**
 * @author 尚硅谷-宋红康
 * @create 16:03
 */
public class Test03 {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}

class Base {
    {
        System.out.println("base");
    }

    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    {
        System.out.println("sub");
    }

    Sub() {
        super.method(70);
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}

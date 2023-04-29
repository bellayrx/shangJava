package com.study.field;

/**
 * @author 尚硅谷-宋红康
 * @create 16:03
 */
class HelloA {
    static {
        System.out.println("static A");
    }

    {
        System.out.println("I'm A Class");
    }

    public HelloA() {
        System.out.println("HelloA");
    }
}

class HelloB extends HelloA {
    static {
        System.out.println("static B");
    }

    {
        System.out.println("I'm B Class");
    }

    public HelloB() {
        System.out.println("HelloB");
    }


}

public class Test01 {
    public static void main(String[] args) {
        new HelloB();
    }
}

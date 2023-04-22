package com.study._final;

/**
 * ClassName: FinalTest
 * Package: com.study._final
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/22 15:19
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
        System.out.println(e.MAX_SCORE);
        System.out.println(e.MIDDLE_SCORE);
    }
}

class F {
    public void method() {
        int num = 10;
        System.out.println(num);
    }

    public void method1(final int m) {
        System.out.println(m);
    }

}

class E {
    final int MIN_SCORE = 0;//显示赋值


    final int MAX_SCORE;
    final int MIDDLE_SCORE;

    {
        MAX_SCORE = 100;
    }//代码块赋值

    public E() {//构造器赋值
        MIDDLE_SCORE = 50;
    }
}

final class A {

}

//class B extends A{}
//class B extends String{}
class C {
    public final void method() {
    }
}

class D extends C {
//    @Override
//    public void method() {
//        super.method();
//    }
}

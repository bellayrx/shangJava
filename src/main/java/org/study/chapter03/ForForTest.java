package org.study.chapter03;

/**
 * 嵌套循环的使用
 * 从二维图形的角度看，外层循环控制`行数`，内层循环控制`列数
 * 实际开发中，我们最多见到的嵌套循环是两层。一般不会出现超过三层的嵌套循环。
 * 如果将要出现，一定要停下来重新梳理业务逻辑，重新思考算法的实现，控制在三层以内。否则，可读性会很差。
 */
public class ForForTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print("*");
        }
        System.out.println("\n######################");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //菱形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 10 - 2 * i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

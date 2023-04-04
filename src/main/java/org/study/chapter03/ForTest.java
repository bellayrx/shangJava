package org.study.chapter03;

/**
 * for循环
 * for (①初始化部分; ②循环条件部分; ④迭代部分)｛
 * ③循环体部分;
 * ｝
 * 执行过程：①-②-③-④-②-③-④-②-③-④-.....-②
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world!");
        }
        int num = 1;
        for (System.out.print("a"); num < 3; System.out.print("c"), num++) {
            System.out.print("b");
        }
        System.out.println();
        //遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数是：" + count);
        System.out.println("偶数的和是：" + sum);
    }
}

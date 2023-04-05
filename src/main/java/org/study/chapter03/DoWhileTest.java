package org.study.chapter03;

/**
 * ①初始化部分;
 * do{
 * ③循环体部分
 * ④迭代部分
 * }while(②循环条件部分);
 * 执行过程：**①-③-④-②-③-④-②-③-④-...-②
 * 开发中使用的较少
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        int sum = 0;
        do {
            if (i % 2 == 0) {
                sum += i;
                count++;
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
        System.out.println("偶数的个数" + count);
        System.out.println("偶数的总和" + sum);
        int num1 = 10;
        while (num1 > 10) {
            System.out.println("while:hello");
            num1--;
        }
        int num2 = 10;
        do {
            System.out.println("while:hello");
            num2--;
        } while (num2 > 10);
    }
}

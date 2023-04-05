package org.study.chapter03;

import java.util.Scanner;

/**
 * 随机生成一个100以内的数，猜这个随机数是多少？
 * <p>
 * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 * <p>
 * 提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
 */
public class WhileTest1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;
        System.out.println(random);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1-100之间的整数");
        int guess = scanner.nextInt();
        int guessCount = 1;
        while (guess != random) {
            if (guess > random) {
                System.out.println("输入的数据大了");
            } else if (guess < random) {
                System.out.println("输入的数据小了");
            }
            System.out.println("请再输入1-100之间的整数");
            guess = scanner.nextInt();
            guessCount++;
        }
        System.out.println("成功");
        System.out.println("您猜的次数是：" + guessCount);
        scanner.close();
    }
}

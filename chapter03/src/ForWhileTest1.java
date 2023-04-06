import java.util.Scanner;

/**
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */
public class ForWhileTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        while (true) {
            System.out.println("请输入一个整数,输入为0时结束程序：");
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                System.out.println("程序结束");
                break;
            }
        }
        System.out.println("正数的个数是：" + positiveCount);
        System.out.println("负数的个数是：" + negativeCount);
        scanner.close();
    }
}

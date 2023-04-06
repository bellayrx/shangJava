import java.util.Scanner;

/**
 * 声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 * <p>
 * =========ATM========
 * 1、存款
 * 2、取款
 * 3、显示余额
 * 4、退出
 * 请选择(1-4)：
 */
public class DoWhileTest1 {
    public static void main(String[] args) {
        double balance = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=========ATM========");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.println("请选择(1-4)：");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("请输入存款的金额：");
                    double money1 = scanner.nextDouble();
                    if (money1 > 0) {
                        balance += money1;
                    }
                    break;
                case 2:
                    System.out.println("请输入取款的金额：");
                    double money2 = scanner.nextDouble();
                    if (money2 > 0 && money2 <= balance) {
                        balance -= money2;
                    } else {
                        System.out.println("您的余额不足");
                    }
                    break;
                case 3:
                    System.out.println("您的余额为：" + balance);
                    break;
                case 4:
                    flag = false;
                    System.out.println("感谢使用，欢迎下次光临");
                    break;
                default:
                    System.out.println("输入错误，重新输入");
                    break;
            }
        } while (flag);
        scanner.close();
    }
}

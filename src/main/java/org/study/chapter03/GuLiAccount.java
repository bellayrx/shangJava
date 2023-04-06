package org.study.chapter03;

/**
 * 李顾帐户
 *
 * @author bella
 * @date 2023/04/06
 */
public class GuLiAccount {
    public static void main(String[] args) {
        boolean flag = true;
        //初始金额
        int balance = 10000;
        String info = "";//记录收支信息
        while (flag) {
            System.out.println("\n-----------------谷粒记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                   请选择(1-4)：");
            char selection = Utility.readMenuSelection();//获取用户的选项
            switch (selection) {
                case '1' -> {
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说    明\n");
                    System.out.println(info);
                    System.out.println("--------------------------------------------------");
                }
                case '2' -> {
                    System.out.print("本次收入金额：");
                    int money1 = Utility.readNumber();
                    if (money1 > 0) {
                        balance += money1;
                    }
                    System.out.print("本次收入说明：");
                    String addDesc = Utility.readString();
                    info += "收入\t" + balance + "\t\t" + money1 + "\t\t" + addDesc + "\n";
                    System.out.println("---------------------登记完成---------------------");
                }
                case '3' -> {
                    System.out.print("本次支出金额：");
                    int money2 = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String desc2 = Utility.readString();
                    if (money2 > 0 && balance >= money2) {
                        balance -= money2;
                    }
                    info += "支出\t" + balance + "\t\t" + money2 + "\t\t" + desc2 + "\n";
                    System.out.println("---------------------登记完成---------------------");
                }
                case '4' -> {
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                    }
                }
                default -> {
                }
            }
        }
    }
}

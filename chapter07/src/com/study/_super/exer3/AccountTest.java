package com.study._super.exer3;

/**
 * ClassName: AccountTest
 * Package: com.study._super.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/17 11:02
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1001, 20000, 0.045);
        account.withdraw(30000);
        System.out.println("账户余额" + account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("账户余额" + account.getBalance());
        System.out.println(account.getAnnualIntersetRate());
        System.out.println(account.getMonthlyInterest());
    }

}

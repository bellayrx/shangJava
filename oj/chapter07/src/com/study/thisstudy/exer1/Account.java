package com.study.thisstudy.exer1;

/**
 * ClassName: Account
 * Package: com.study.thisstudy.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 11:23
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void depoist(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("成功存入" + amt);
        }
    }

    public void withDraw(double amt) {
        if (balance >= amt && amt > 0) {
            balance -= amt;
            System.out.println("成功取出" + amt);
        } else {
            System.out.println("取款数额有误或余额不足");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}

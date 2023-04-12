package com.study.constructor.exer;

/**
 * ClassName: Account
 * Package: com.study.constructor.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 16:28
 * @Version 1.0
 */
public class Account {
    private int id;//账号
    private double balance; //余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //取钱
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        } else {
            System.out.println("余额不足，取款失败");
        }

    }

    //存款
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }

}

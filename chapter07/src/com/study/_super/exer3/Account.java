package com.study._super.exer3;

/**
 * ClassName: Account
 * Package: com.study._super.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/17 10:55
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualIntersetRate;

    public Account() {
    }

    public Account(int id, double balance, double annualIntersetRate) {
        this.id = id;
        this.balance = balance;
        this.annualIntersetRate = annualIntersetRate;
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

    public double getAnnualIntersetRate() {
        return annualIntersetRate;
    }

    public void setAnnualIntersetRate(double annualIntersetRate) {
        this.annualIntersetRate = annualIntersetRate;
    }

    public double getMonthlyInterest() {
        return annualIntersetRate / 12;
    }

    /**
     * 取钱
     *
     * @param amount 量
     */
    public void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("");
        } else {
            System.out.println("您的余额不足");
        }
    }

    /**
     * 存款
     *
     * @param amount 量
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

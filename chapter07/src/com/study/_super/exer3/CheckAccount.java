package com.study._super.exer3;

/**
 * ClassName: ChechAccount
 * Package: com.study._super.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/17 11:05
 * @Version 1.0
 */
public class CheckAccount extends Account {

    private double overdraft;

    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualIntersetRate, double overdraft) {
        super(id, balance, annualIntersetRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 透支的账户
     *
     * @param amount 量
     */
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else if (getBalance() + overdraft >= amount) {
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        } else {
            System.out.println("超过可支配限额");
        }
    }
}

package com.study.thisstudy.exer1;

/**
 * ClassName: BankTest
 * Package: com.study.thisstudy.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 11:37
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("w","w");
        bank.addCustomer("c","c");
        bank.getCustoms(0).setAccount(new Account(1000));
        bank.getCustoms(0).getAccount().withDraw(50);
        System.out.println(bank.getCustoms(0).getAccount().getBalance());
        bank.getCustoms(1).setAccount(new Account(1000));
        System.out.println(bank.getCustoms(0));
        System.out.println(bank.getCustoms(1));

    }
}

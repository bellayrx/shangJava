package com.study._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Package: com.study._super.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/17 20:42
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println(checkAccount.getBalance());
        System.out.println("您的可透支额度："+checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println(checkAccount.getBalance());
        System.out.println("您的可透支额度："+checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println(checkAccount.getBalance());
        System.out.println("您的可透支额度："+checkAccount.getOverdraft());


    }
}

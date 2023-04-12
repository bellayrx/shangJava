package com.study.constructor.exer;

/**
 * ClassName: CustomerTest
 * Package: com.study.constructor.exer
 * Description:
 * 案例：
 * <p>
 * 1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的构造器：自定义
 * 包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 * <p>
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * <p>
 * <p>
 * 2、创建Customer类。
 * a. 声明三个私有对象属性：firstName、lastName和account。
 * b. 声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f和l）
 * c. 声明两个公有存取器来访问该对象属性，方法getFirstName和getLastName返回相应的属性。
 * d. 声明setAccount 方法来对account属性赋值。
 * e. 声明getAccount 方法以获取account属性。
 * <p>
 * 3、写一个测试程序。
 * <p>
 * （1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 * （2）对Jane Smith操作。
 * 存入 100 元，再取出960元。再取出2000元。
 * 打印出Jane Smith 的基本信息：
 * <p>
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
 *
 * @Author wkm
 * @Create 2023/4/12 16:29
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        //创建Customer实例
        Customer customer = new Customer("Jane", "Smith");

//        Account account = new Account(1000,2000,0.0123);
//        customer.setAccount(account);
        //或
        customer.setAccount(new Account(1000, 2000, 0.0123));


        //针对于客户的账户进行取钱、存钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //输出客户信息
        //Customer [Smith, Jane] has a account: id is 1000,
        // annualInterestRate is 1.23％, balance is 1140.0
        System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() +
                "] has a account:id is " + customer.getAccount().getId() + ",annualInterestRate is " +
                customer.getAccount().getAnnualInterestRate() * 100 + "%,balance is " +
                customer.getAccount().getBalance());


        /*
         * 关于匿名对象
         *
         * 1. 匿名对象往往只能被调用一次
         * 2. 匿名对象常常作为实参传递给方法的形参。
         * */
        new Account(1001, 2000, 0.0123).withdraw(1000);
        System.out.println(new Account(1001, 2000, 0.0123).getBalance());

        int num = 10;

    }

}

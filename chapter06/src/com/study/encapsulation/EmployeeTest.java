package com.study.encapsulation;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.study.encapsulation
 * Description:
 * <p>
 * 案例：普通员工类
 * <p>
 * （1）声明员工类Employee，
 * <p>
 * - 包含属性：姓名、性别、年龄、电话，属性私有化
 * <p>
 * - 提供get/set方法
 * <p>
 * - 提供String getInfo()方法
 * <p>
 * <p>
 * （2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 *
 * @Author wkm
 * @Create 2023/4/12 15:11
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //创建Employee[]
        Employee[] emps = new Employee[2];

        for (int i = 0; i < emps.length; i++) {

            emps[i] = new Employee();

            System.out.println("----------添加第" + (i + 1) + "个员工----------");
            System.out.print("姓名：");
            String name = scan.next();
            System.out.print("性别：");
            char gender = scan.next().charAt(0);
            System.out.print("年龄：");
            int age = scan.nextInt();
            System.out.print("电话：");
            String phoneNumber = scan.next();

            //给指定的employee对象的各属性赋值
            emps[i].setName(name);
            emps[i].setGender(gender);
            emps[i].setAge(age);
            emps[i].setPhoneNumber(phoneNumber);
        }
        scan.close();
        //遍历员工列表
        System.out.println("---------------员工列表------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emps.length; i++) {
            System.out.println((i + 1) + "\t" + emps[i].toString());
        }
        System.out.println("---------------员工列表完成------------------");
    }
}

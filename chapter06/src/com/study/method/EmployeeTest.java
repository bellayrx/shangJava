package com.study.method;

/**
 * ClassName: EmployeeTest
 * Package: com.study.method
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/10 10:21
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1);
        e1.id = 1001;
        e1.name = "张三";
        e1.age = 24;
        e1.salary = 100;
        System.out.println(e1.id + "," + e1.name + "," + e1.age + "," + e1.salary + "," + Employee.info);
        e2.id = 1002;
        e2.name = "张四";
        e2.age = 26;
        e2.salary = 500;
        System.out.println(e2.id + "," + e2.name + "," + e2.age + "," + e2.salary + "," + Employee.info);
    }
}

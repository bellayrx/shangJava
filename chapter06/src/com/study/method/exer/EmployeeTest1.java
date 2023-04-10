package com.study.method.exer;


/**
 * ClassName: EmployeeTest1
 * Package: com.study.method
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/10 10:34
 * @Version 1.0
 */
public class EmployeeTest1 {
    public static void main(String[] args) {
        //先有类的加载在方法区，不调用，不执行
        //创建Employee的实例
        Employee1 emp1 = new Employee1();
        emp1.id = 1001;
//        emp1.name ="杰克"; 暂时和下面一样 凡是引用类型存的都是地址值，String放常量池里，
//        JDK6在方法区，JDK7在堆空间

        emp1.name = new String("杰克");
        emp1.age = 24;
        emp1.salary = 8900;
        emp1.birthday = new MyDate();
        emp1.birthday.year = 1998;
        emp1.birthday.month = 2;
        emp1.birthday.day = 28;
       /* MyDate myDate = new MyDate();
        emp1.birthday=myDate;
        和上面一行一样
        */
        //打印员工信息
//        System.out.println("id = " + emp1.id + ",name = " + emp1.name +
//                ", age = " + emp1.age + ", salary = " + emp1.salary +
//                ", birthday = [" + emp1.birthday.year + "年" + emp1.birthday.month +
//                "月" + emp1.birthday.day + "日]");
        emp1.show();
        System.out.println(emp1.show1());
    }
}

package com.study.method.exer;

import com.study.method.MyDate;

/**
 * ClassName: Employee1
 * Package: com.study.method
 * Description:
 * <p>
 * 案例：将属性测试的exer1中关于员工信息的输出内容放到方法中。通过调用方法显示。
 *
 * @Author wkm
 * @Create 2023/4/10 10:34
 * @Version 1.0
 */
public class Employee1 {
    int id;
    String name;
    int age;
    double salary;
    MyDate birthday;

    public void show() {
        System.out.println("id = " + id + ",name = " + name +
                ", age = " + age + ", salary = " + salary +
                ", birthday = [" + birthday.year + "年" + birthday.month +
                "月" + birthday.day + "日]");
    }

    public String show1() {
        return "id = " + id + ",name = " + name +
                ", age = " + age + ", salary = " + salary +
                ", birthday = [" + birthday.year + "年" + birthday.month +
                "月" + birthday.day + "日]";
    }
}

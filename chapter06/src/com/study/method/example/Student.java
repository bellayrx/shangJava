package com.study.method.example;

/**
 * ClassName: Student
 * Package: com.study.method.example
 * Description:
 * <p>
 * 对象数组
 * <p>
 * 1. 何为对象数组？如何理解？
 * 数组的元素可以是基本数据类型，也可以是引用数据类型。当元素是引用类型中的类时，我们称为对象数组。
 * <p>
 * 2. 举例：
 * String[],Person[],Student[],Customer[]等
 * <p>
 * 3. 案例：
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * 年级[1,6] : (int)(Math.random() * 6 + 1)
 * 分数[0,100] : (int)(Math.random() * 101)
 * <p>
 * <p>
 * 4. 内存解析：
 * <p>
 * <p>
 * 5. 拓展：提供封装Student相关操作的工具类
 *
 * @Author wkm
 * @Create 2023/4/11 9:16
 * @Version 1.0
 */
public class Student {
    int number;
    int state;
    int score;

    public void show() {
        System.out.println("number : " + number + ",state : " +
                state + ", score : " + score);
    }
}
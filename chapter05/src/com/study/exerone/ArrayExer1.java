package com.study.exerone;
/*

案例：输出英文星期几

用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}

拓展：一年12个月的存储

用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
{"January","February","March","April","May","June","July","August","September","October","November","December"}

 */

import java.util.Scanner;

/**
 * ClassName: ArrayExer1
 * Package: com.study.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/7 14:15
 * @Version 1.0
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        String[] weeks = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值：1-7");
        int day = scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("数据有误");
        } else {
            System.out.println(weeks[day - 1]);
        }
        scanner.close();

    }
}

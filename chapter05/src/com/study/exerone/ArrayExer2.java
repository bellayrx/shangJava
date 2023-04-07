package com.study.exerone;
/*

案例：学生考试等级划分

从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
    成绩>=最高分-10    等级为’A’
    成绩>=最高分-20    等级为’B’
    成绩>=最高分-30    等级为’C’
    其余              等级为’D’

提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */

import java.util.Scanner;

/**
 * ClassName: ArrayExer2
 * Package: com.study.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/7 14:19
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = scanner.nextInt();
        int i = 0;
        int[] scores = new int[count];
        int maxScore = scores[0];
        System.out.println("请输入" + count + "个成绩");
        while (i < count) {
            scores[i] = scanner.nextInt();
            maxScore = Math.max(maxScore, scores[i]);
            i++;
        }
        System.out.println("最高分：" + maxScore);
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] >= maxScore - 10) {
                System.out.println("student " + j + " score is " + scores[j] +
                        " grade is A");
            } else if (scores[j] >= maxScore - 20) {
                System.out.println("student " + j + " score is " + scores[j] +
                        " grade is B");
            } else if (scores[j] >= maxScore - 30) {
                System.out.println("student " + j + " score is " + scores[j] +
                        " grade is C");
            } else {
                System.out.println("student " + j + " score is " + scores[j] +
                        " grade is D");
            }
        }

        scanner.close();
    }
}

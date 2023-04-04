package org.study.chapter03;

/**
 * 分支结构1：条件判断
 * 成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
 */
public class IfElseTest {
    public static void main(String[] args) {
        int heartBeats = 89;
        if (heartBeats >= 60 && heartBeats <= 100) {
            System.out.println("体检结束");
        } else {
            System.out.println("进一步检查");
        }

        //定义一个整数，判定是偶数还是奇数
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }


    }
}

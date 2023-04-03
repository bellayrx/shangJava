package org.study.chapter02;

/**
 * 条件练习
 * 今天是周2，10天以后是周几？
 * <p>
 * 要求：控制台输出"今天是周2，10天以后是周x"。
 * 开发中，如果既可以使用条件运算符，又可以使用if-else，推荐使用条件运算符。因为执行效率稍高。
 */
public class ConditionExer {
    public static void main(String[] args) {
        int week = 4;
        week += 10;
        week %= 7;
        System.out.println((week) == 0 ? 1 : week);
    }
}

package org.study.chapter03;

/**
 * switch-case学习
 * <p>
 * switch(表达式){
 * case 常量值1:
 * 语句块1;
 * //break;
 * case 常量值2:
 * 语句块2;
 * //break;
 * // ...
 * [default:
 * 语句块n+1;
 * break;
 * ]
 * }
 * </p>
 * 根据表达式中的值，依次匹配case语句，一旦与某一个case中的常量相等，执行case语句，执行完成之后，遇到
 * break，跳出switch，没有遇到break，则继续执行其后的case执行语句，知道遇到break或者把default执行完成
 * case穿透
 * <p>
 * switch中表达式只能是特定的数据类型：byte short int char 枚举（jdk5.0新增） string(jdk7.0)
 * case后跟的常量，表达式与常量做相等的判断，不能做范围的判断
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 0:
                System.out.println("zero");
                break;//跳出switch-case结构
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }

        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;
        }
    }
}

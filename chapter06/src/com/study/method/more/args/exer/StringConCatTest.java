package com.study.method.more.args.exer;

/**
 * ClassName: StringConCatTest
 * Package: com.study.method.more.args.exer
 * Description:
 * <p>
 * 练习：可变形参的方法
 * <p>
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 *
 * @Author wkm
 * @Create 2023/4/11 11:31
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest stringConCatTest = new StringConCatTest();
        System.out.println(stringConCatTest.concat("-", "hello", "world", "oops"));
        System.out.println(stringConCatTest.concat(".", "1"));
    }

    public String concat(String operator, String... str) {
        String result = "";
        for (int i = 0; i < str.length; i++) {
            if (0 == i) {
                result += str[i];
            } else {
                result += (operator + str[i]);
            }
        }
        return result;
    }
}

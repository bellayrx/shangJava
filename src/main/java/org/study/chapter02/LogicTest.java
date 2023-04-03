package org.study.chapter02;

/**
 * 测试逻辑运算符
 * & 逻辑与，&&短路与，&与，^异或
 * 针对的都是布尔类型的变量
 * 运算结果也是布尔类型
 * 常常使用在条件判断、循环结构中
 * 开发中&&
 */
public class LogicTest {
    public static void main(String[] args) {
        //逻辑与和短路与的区别：都是表达且的关系，只有当符号左右两边均为true，结果为true；不同点:等号左边为false,&&不执行右边的
        boolean b1 = true;
        int num1 = 10;
        b1 = false;
        if (b1 & (num1++) > 0) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德纲");
        }
        System.out.println(num1);

        boolean b2 = true;
        int num2 = 10;
        b2 = false;
        if (b2 && (num2++) > 0) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德纲");
        }
        System.out.println(num2);


        //
        boolean b3 = true;
        int num3 = 10;
        b3 = false;
        if (b3 | (num3++) > 0) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德纲");
        }
        System.out.println(num3);

        boolean b4 = true;
        int num4 = 10;
        b4 = false;
        if (b4 || (num4++) > 0) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德纲");
        }
        System.out.println(num4);


    }
}

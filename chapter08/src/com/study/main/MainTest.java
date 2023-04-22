package com.study.main;

/**
 * ClassName: MainTest
 * Package: com.study.main
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/22 14:18
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[]{"AA","BB","CC"});
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Main的main方法：");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

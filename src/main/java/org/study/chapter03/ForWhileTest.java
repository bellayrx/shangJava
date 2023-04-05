package org.study.chapter03;

/**
 * 无限循环结构的使用
 * while(true)
 * for(;;)
 */
public class ForWhileTest {
    public static void main(String[] args) {
//        while (true) {
        for (; ; ) {
            System.out.println("xxx");
        }
        //死循环后面不能有执行语句

    }
}

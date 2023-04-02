package org.study.chapter02;

/**
 * 测试字符类型和布尔类型
 */
public class VariableTest2 {
    public static void main(String[] args) {
        //字符类型 2个字节
        //表示形式一：使用一对单引号表示，内部只能有一个字符，不能没有
        //char c1 = '';错误的
        char c1 = 'a';
        char c2 = '中';
        char c3 = '%';
        char c4 = '1';
        System.out.println(c3);

        //表示形式二：直接使用unicode值表示字符型常量
        char c8 = '\u0041';//'A' "u"表示unicode
        System.out.println(c8);
        //表示形式三：使用转义字符
        char c9 = '\n';
        char c10 = '\t';
        System.out.println("hello" + c9 + "dw" + c10);
        //表示形式四：
        char c11 = 97;
        System.out.println(c11);//c11是a 因为最早的字符集是ASCII，
        char c12 = '1';
        char c13 = 1;
        System.out.println(c12 == c13);

        //布尔类型  我们不说占用几个字节，Java虚拟机中用int 1表示true，0表示false
        boolean b1 = true;
        boolean b2 = false;
        //错误：boolean b3 = 0;
        System.out.println(b1);

    }
}

package org.study.chapter02;

/**
 * 测试基本数据类类型变量间的运算规则
 * 做运算的基本数据类型有7种，不包含boolearn，char可以运算
 * 运算规则：
 * 1.自动类型提升
 * 2.强制类型转换
 * VariablrTest3测试自动类型提升
 * 容量小与容量大运算，结果自动转换为容量大的变量
 * 此时的容量小与大并非是占用的内存空间的大小，而是指表示数据范围的大小
 * byte->short->int ->long-> Float -> Double
 * 特别地：
 * byte+byte=int short+short=int byte+short=int
 * byte short char 两两运算，结果为int
 * 整形常量规定为int,浮点常量规定为double
 * 为啥标识符不允许数字开头？不清楚是变量名还是数值
 */
public class VariablrTest3 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;
        long l1 = i1;
        System.out.println(l1);
        float f1 = l1;
        byte b1 = 12;
        int i3 = b1 + i1;
        System.out.println(i3);
        //特殊情况1
        byte b3 = 12;
        short s1 = 10;
        //short s2 = b3+s1; 结果用int接收
        int i4 = b3 + s1;
        System.out.println(i4);
        //特殊情况2：char
        char c1 = 'a';
        //char c2=c1+b3;编译不通过
        int i5 = c1 + b3;
        System.out.println(i5);
        //
        long l2 = 123L;
        long l3 = 123;//123为int，转换为long了
        long l4 = 123123123123131331L;//这个数目太大了，要加L,不要自动类型转化
        float f2 = 12.3F;
        //float f3 = 12.3;你不加F，12.3是为double，不允许这么写
        byte b5 = 10;
        int i11 = b5 + 1;//怎么看这个1？整形常量规定为int
        double d1 = b5 + 12.3;//怎么看这个12.3？浮点常量规定为double
        //说明为什么不允许数字开头
/*        int 123L = 12;
        long l6 = 123L;*/


    }
}

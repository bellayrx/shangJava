package org.study.chapter02;

/**
 * 测试赋值运算符的使用
 * +=,-=,*=,/=,%=
 * 支持连续赋值
 * 不会改变变量本身的类型
 */
public class SetValueTest {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;//自动类型提升
        byte b = (byte) i;//强转
        int ai = 10;
        int bi = 10;
        int a2, b2;
        a2 = b2 = 10;
        System.out.println(a2 + "," + b2);
        int a3 = 10, b3 = 20;
        //+=
        int m1 = 10;
        m1 += 5;//类似 m1=m1+5
        System.out.println(m1);
        byte by1 = 10;
        by1 += 5;//5是int类型的 不等于by1=by1+5，会编译不通过
        System.out.println(by1);
        int m2 = 1;
        m2 *= 0.1;
        System.out.println(m2);
        //自增2 推荐第二种
        int n1 = 10;
        n1 = n1 + 2;
        int n2 = 10;
        n2 += 2;
        //变量自增i1
        int n3 = 10;
        ++n3;
    }
}

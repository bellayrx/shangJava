package org.study.chapter02;

/**
 * 测试整形和浮点型变量的使用
 */
public class VariableTest1 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 127;
        //byte b3 = 128; 超过类型大小
        long l1 = 123123L;
        System.out.println(l1);
        int create = 12;
        System.out.println(create);
        //测试浮点类型 float 4字节（同int） 7位有效数字、double 8字节（开发用，同long）
        //float>long 最大的数
        double d1 = 12.3;
        float d2 = 12.3F;
        System.out.println(d2);
        System.out.println(0.1 + 0.2);
        //测试2：
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);
        System.out.println(ff2);
        System.out.println(ff1 == ff2);//相等的

    }
}

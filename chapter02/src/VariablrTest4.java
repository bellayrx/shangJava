/**
 * 测试强制类型转换
 * 规则：
 * 容量大的转换为容量小的类型，使用强制类型转换，使用强转符（），在（）指名转换为的数据类型
 * 可能导致精度损失,遵循截断
 */
public class VariablrTest4 {
    public static void main(String[] args) {
        double d1 = 12;//自动类型转换
//        int i1= d1;编译不通过
        int i2 = (int) d1;//强制转换
        System.out.println(i2);
        long l1 = 123;
//        short s1=l1;编译不通过
        short s1 = (short) l1;
        System.out.println(s1);
        int i3 = 12;
        float f1 = i3;//类型提升
        System.out.println(f1);
        float f2 = (float) i3;//没有必要特意加，

        //精度损失问题
        double d2 = 12.9;
        int i4 = (int) d2;
        System.out.println(i4);
        int i5 = 128;
        byte b1 = (byte) i5;
        System.out.println(b1);
    }
}

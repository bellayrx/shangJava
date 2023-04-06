/**
 * 位运算符
 * << >> >>>(无符号右移) & | ^ ~
 * 针对的都是数值类型变量或常量运算，运算的结果也是数值
 * 在一定范围内，左移相当于*2,右移相当/2
 * 用高效的方式计算2*8？2左移三位
 * >>>无符号右移
 */
public class BitTest {
    public static void main(String[] args) {
        int num1 = 7;//补码，补码
        System.out.println(num1 << 1);
        System.out.println(num1 << 2);
        System.out.println(num1 << 28);
        System.out.println(num1 << 29);//过犹不及，变负了 int是32位
        int num2 = -7;
        System.out.println(num2 << 1);
        System.out.println(num2 << 2);
        System.out.println(num2 << 3);
        int num3 = 2;
        System.out.println(num3 >> 3);
        System.out.println(num3 >>> 1);


    }
}

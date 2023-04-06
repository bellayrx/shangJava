/**
 * 测试运算符的使用1
 * + - * / % ++ --
 * 模数与被模数的符号相同
 */
public class AriTest {
    public static void main(String[] args) {
        int m1 = 12;
        int n1 = 5;
        int k1 = m1 / n1;
        System.out.println(k1);
        System.out.println(m1 / n1 * n1);

        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1);
        //某个数能否整除另外一个数 num1%num2==0
        int i2 = 12;
        int j2 = -5;
        System.out.println(i2 % j2);
        int i3 = -12;
        int j3 = 5;
        System.out.println(i3 % j3);
        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4);

        //++
        int a1 = 10;
        int b1 = ++a1;
        System.out.println(a1 + " " + b1);
        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2 + " " + b2);

        int i = 10;
        i++;
        System.out.println(i);
        //自增和+1还是有点区别的
        short s1 = 10;
        s1 = (short) (s1 + 1);
        s1++;
        System.out.println(s1);

    }
}

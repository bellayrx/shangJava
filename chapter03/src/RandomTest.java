/**
 * 获取随机数
 * 使用Java提供的API：Math.random();
 * Math类的random()的调用，会返回一个[0,1)范围的一个double型值 左闭右开
 * 如何获取`[a,b]`范围内的随机整数呢？`(int)(Math.random() * (b - a + 1)) + a`
 */
public class RandomTest {
    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println(d1);
        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);
        int num3 = (int) (Math.random() * 101);
        System.out.println(num1 + " " + num2 + " " + num3);
        int number = (int) (Math.random() * 6) + 1; //
        System.out.println(number);
    }
}

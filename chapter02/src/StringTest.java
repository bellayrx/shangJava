/**
 * 基本数据类型与String运算
 * 1.String是类，是引用数据类型,俗称字符串
 * 2.String用“”定义
 * 3.String可包含0个、1个、多个字符
 * 与基本数据类型的运算：有8种，包含bool
 * String与基本数据类型只能做连接运算，使用+表示
 * 运算的结果是String类型
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello world";
        System.out.println("str1");
        System.out.println(str1);
        String str2 = "";
        System.out.println(str2);
        String str3 = "a";//char c ='a';

        int num1 = 10;
        boolean b1 = true;
        String str4 = "hello";
        System.out.println(str4 + b1 + num1);
//        String str5 = num1 + b1 + str4; 编译不通过，只能String开头
        int num2 = 10;
        String str7 = num2 + "";
        String str8 = "abc"; //不能转换为基本数据类型
//        int num3=(int)str7; 错误
        int i = Integer.parseInt(str7);
        System.out.println(i);


    }
}

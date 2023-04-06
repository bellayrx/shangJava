/**
 * 练习
 * 随意给出一个三位整数，打印显示它的个位数，十位数，百位数的值。
 * 格式如下：
 * 数字xxx的情况如下：
 * 个位数：
 * 十位数：
 * 百位数：
 * <p>
 * 例如：
 * 数字153的情况如下：
 * 个位数：3
 * 十位数：5
 * 百位数：1
 */
public class AriExer {
    public static void main(String[] args) {
        int num = 1530;
        int ge = 153 % 10;//个位
        int shi = 153 / 10 % 10;//百位
        int bai = 153 / 100;
        System.out.println(ge + " " + shi + " " + bai);
        while (num > 0) {
            int x = num % 10;
            num = num / 10;
            System.out.println(x);
        }

    }
}

/**
 * 条件运算符
 * 凡是能使用条件运算符的位置，都可以改写为if-else
 * 能使用if-else，不一定能改写为条件运算符
 * 开发中，如果既可以使用条件运算符，又可以使用if-else，推荐使用条件运算符。因为执行效率稍高。
 */
public class ConditionTest {
    public static void main(String[] args) {
        String info = (2 > 10) ? "表达式1" : "表达式2";
        System.out.println(info);
        double result = (2 > 1) ? 1 : 2.0;
        System.out.println(result);
        //获取较大值
        int m = 10;
        int n = 20;
        int max = (m > n) ? m : n;
        System.out.println(max);
        //获取最大值
        int i = 20;
        int j = 30;
        int k = 23;
        int max_1 = (i > j) ? (i > k ? i : k) : (j > k ? j : k);
        System.out.println(max_1);
    }
}

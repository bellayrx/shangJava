/**
 * while循环
 * 理论上for和while相互转换
 * ①初始化部分
 * while(②循环条件部分)｛
 * ③循环体部分;
 * ④迭代部分;
 * }
 * ①-②-③-④-②-③-④-②-③-④-...-②
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            System.out.println(i + ":hello world!");
            i++;
        }

        int j = 1;
        int sum = 0;
        int count = 0;
        while (j <= 100) {
            if (j % 2 == 0) {
                sum += j;
                count++;
            }
            j++;
        }
        System.out.println("偶数的个数是：" + count);
        System.out.println("偶数的和是：" + sum);
    }
}

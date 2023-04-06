/**
 * 交换int的值
 */
public class BitExer {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //方式一
        int tmp = m;
        m = n;
        n = tmp;
        System.out.println("m=" + m + ",n=" + n);
        //方式二：不适用于int类型
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("m=" + m + ",n=" + n);
        //方式三：异或
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("m=" + m + ",n=" + n);


    }
}

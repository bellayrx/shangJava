/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数
 */
public class ForTest2 {
    public static void main(String[] args) {
        int m = 12;
        int n = 20;
        int min = m < n ? m : n;
        int max = Math.max(m, n);
        int result = 0;
//        for (int i = 1; i <= min; i++) {
//            if (m % i == 0 && n % i == 0) {
//                result = Math.max(result, i);
//
//            }
//        }
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                result = i;
                break;
            }
        }
        for (int i = max; ; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数" + i);
                break;
            }
        }

        System.out.println("最大公约数" + result);

    }
}

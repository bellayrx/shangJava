package org.study.chapter03;

/**
 * 100000以内的呢？
 */
public class PrimeNumberTest1 {
    public static void main(String[] args) {
        //方式二：
        int count = 0;//个数
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//1885-->sqrt 16
        System.out.println(count);//9592
    }
}

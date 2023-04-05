package org.study.chapter03;

/**
 * 找出100以内所有的素数（质数）？100000以内的呢？
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        //方式一：
        //获取系统当前时间
        long start = System.currentTimeMillis();
        int count = 0;//个数
        for (int i = 2; i <= 100000; i++) {
            int number = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    number++;
                }
            }
            if (number == 0) {
                count++;
            }
        }
        //获取系统当前时间
        long end = System.currentTimeMillis();
        System.out.println(end - start);//18451
        System.out.println(count);//9592
    }
}

package com.study.method.more.valuetransfer;

/**
 * ClassName: ValueTransferTest2
 * Package: com.study.method.more.valuetransfer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/11 14:29
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 valueTransferTest2 = new ValueTransferTest2();
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //交换变量的值
        valueTransferTest2.swap(m, n);
        System.out.println("m=" + m + ",n=" + n);
    }

    public void swap(int m, int n) {
        int tmp = m;
        m = n;
        n = tmp;
    }
}

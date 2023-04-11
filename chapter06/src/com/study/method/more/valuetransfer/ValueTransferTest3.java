package com.study.method.more.valuetransfer;

/**
 * ClassName: ValueTransferTest3
 * Package: com.study.method.more.valuetransfer
 * Description: 交换数值
 *
 * @Author wkm
 * @Create 2023/4/11 15:02
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.m = 10;
        data1.n = 20;
        System.out.println("m=" + data1.m + ",n=" + data1.n);

        int tmp = data1.m;
        data1.m = data1.n;
        data1.n = tmp;
        System.out.println("m=" + data1.m + ",n=" + data1.n);
        ValueTransferTest3 valueTransferTest3 = new ValueTransferTest3();
        valueTransferTest3.swap(data1);
        System.out.println("m=" + data1.m + ",n=" + data1.n);

    }

    public void swap(Data data) {
        int tmp = data.m;
        data.m = data.n;
        data.n = tmp;
    }
}

class Data {
    int m;
    int n;
}

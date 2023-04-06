package com.hw;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //商品number
        //最大持有数量item【index】
        Scanner scanner = new Scanner(System.in);
        int shoopingNumber = scanner.nextInt();//商品number
        int shoopingDays = scanner.nextInt();

        int[] goodsItem = new int[shoopingNumber];
        for (int i = 0; i < shoopingNumber; i++) {
            goodsItem[i] = scanner.nextInt();
        }
        int[][] goods_item_price =
                new int[shoopingNumber][shoopingDays];
        for (int i = 0; i < shoopingNumber; i++) {
            for (int j = 0; j < shoopingDays; j++) {
                goods_item_price[i][j] = scanner.nextInt();
            }
        }

        int goods_result = 0;
        for (int i = 0; i < shoopingNumber; i++) {
            for (int j = 0; j < shoopingDays - 1; j++) {
                int goods_price_a = goods_item_price[i][j];
                int everyday_buy = goods_item_price[i][j + 1];
                if (everyday_buy > goods_price_a) {
                    goods_result +=
                            (everyday_buy -
                                    goods_price_a) * goodsItem[i];

                }
            }
        }
        System.out.println(goods_result);
    }


}

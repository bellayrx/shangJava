package com.study.one;

/**
 * ClassName: OneArrayTest
 * Package: com.study.one
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/6 22:35
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        //声明
        double[] prices;
        //静态初始化；数组变量的赋值和数组元素赋值的操作同时进行
        prices = new double[]{20.32, 43.21, 43.22};
        String[] foods = new String[]{"拌海蜇", "龙须菜", "强冬笋", "玉兰片"};
//        动态初始化：数组变量的赋值和数组元素赋值的操作分开进行
        String[] foods2 = new String[4];//4是长度
//        其他正确的方式
        int[] arra = new int[4];
        int[] arr1 = {1, 2, 3, 4};//省略了--类型推断
//        错误的方式,不要动静结合
//        int[] arra2=new int[3]{1,2,3};
//        int[3] arra4 = new int[];

        //数组元素的调用
        //通过角标的方式获取数组的元素
        //角标的范围从0开始，到长度-1结束
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
//        System.out.println(prices[3]);数组越界异常
        foods2[0] = "拌海蜇";
        foods2[1] = "龙须菜";
        foods2[2] = "强冬笋";
        foods2[3] = "玉兰片";
        //数组的长度--数组容器的容量，使用length属性表示
        System.out.println(foods.length);
        System.out.println(prices.length);

        //遍历数组
        for (String food : foods) {
            System.out.println(food);
        }


    }
}

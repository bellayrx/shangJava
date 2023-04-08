package com.study.search_sort;

/**
 * ClassName: ArrayExer01_1
 * Package: com.study.search_sort
 * Description:
 * <p>
 * 案例1：数组的扩容:
 * <p>
 * 现有数组 int[] arr = new int[]{1,2,3,4,5};
 * 现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
 *
 * @Author wkm
 * @Create 2023/4/8 19:07
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] newArra = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            newArra[i] = arr[i];
        }
        newArra[arr.length] = 10;
        newArra[arr.length + 1] = 20;
        newArra[arr.length + 2] = 30;
        arr = newArra;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

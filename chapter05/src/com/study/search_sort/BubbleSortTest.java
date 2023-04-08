package com.study.search_sort;

/**
 * ClassName: BubbleSortTest
 * Package: com.study.search_sort
 * Description:
 * <p>
 * 案例1：使用冒泡排序，实现整型数组元素的排序操作
 * <p>
 * 比如：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 *
 * @Author wkm
 * @Create 2023/4/9 0:05
 * @Version 1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int j = 0; j < arr.length - 1; j++) {
            //for (int i = 0; i < arr.length-1; i++) {//优化
            for (int i = 0; i < arr.length - 1 - j; i++) {//优化
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

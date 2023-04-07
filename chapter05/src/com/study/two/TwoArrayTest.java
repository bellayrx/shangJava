package com.study.two;

/**
 * ClassName: TwoArrayTest
 * Package: com.study.two
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/7 14:46
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};//静态初始化
        String[][] arr3 = new String[3][4];//动态初始化1
        double[][] arr4 = new double[2][];//动态初始化2
        //其他写法：
        int arr5[][] = new int[][]{};
        int[] arr6[] = new int[][]{};
        int arr7[][] = {{1, 2, 3, 4}, {5, 6}};
        String arr8[][] = new String[3][4];
        //错误的写法
        //		int[][] arr9 = new int[3][3]{{1,2,3},{4,5,6},{7,8,9}};
//		int[3][3] arr10 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//		int[][] arr11 = new int[][10];
        //2. 数组元素的调用
        //针对于arr2来说，外层元素{1,2,3}、{4,5}、{6,7,8,9} 内层元素：1,2,3,4,5,6,7,8,9
        //调用内层元素
        System.out.println(arr2[0][1]);
        System.out.println(arr2[2][1]);
        //调用外层元素
        System.out.println(arr2[0]);//[I@4eec7777
        arr3[0][1] = "Tom";
        System.out.println(arr3[0][1]);

        arr4[0] = new double[4];
        arr4[0][0] = 1.0;
        System.out.println(arr4[0][0]);

        //3. 数组的长度
        System.out.println(arr2.length);//3
        System.out.println(arr2[0].length);//3
        System.out.println(arr2[1].length);//2
        System.out.println(arr2[2].length);//4
        System.out.println("####################");
        //4. 如何遍历数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}

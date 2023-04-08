package com.study.exertwo;
/*


案例1：获取arr数组中所有元素的和。

提示：使用for的嵌套循环即可。
 */

/**
 * ClassName: ArrayExer01
 * Package: com.study.exertwo
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/7 23:44
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        //初始化数组：静态初始化
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        /*
         * 不建议使用动态初始化
         * int[][] arr = new int[3][];
         * arr[0] = new int[3];
         * arr[0][0] = 3;
         * ...
         *
         * */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);
    }
}

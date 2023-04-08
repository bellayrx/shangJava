package com.study.search_sort;

/**
 * ClassName: LinearSearchTest
 * Package: com.study.search_sort
 * Description:
 * 案例1：线性查找
 * <p>
 * 定义数组：int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 *
 * @Author wkm
 * @Create 2023/4/8 20:47
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int target = 5;

        //线性查找
//        boolean isFlag = false;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] == target) {
//                System.out.println("找到了" + target + ",对应的索引为:" + i);
//                isFlag=true;
//                break;
//            }
//        }
//        if (!isFlag){
//            System.out.println("没找到");
//        }
        //2
        int i = 0;
        for (; i < arr1.length; i++) {
            if (arr1[i] == target) {
                System.out.println("找到了" + target + ",对应的索引为:" + i);
                break;
            }
        }
        if (i == arr1.length) {
            System.out.println("没找到");
        }
    }
}

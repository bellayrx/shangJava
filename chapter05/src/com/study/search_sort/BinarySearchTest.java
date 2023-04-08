package com.study.search_sort;

/**
 * ClassName: BinarySearchTest
 * Package: com.study.search_sort
 * Description:案例2：二分法查找
 * <p>
 * 定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 *
 * @Author wkm
 * @Create 2023/4/8 20:45
 * @Version 1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int target = 5;
        int left = 0;
        int right = arr2.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr2[mid] == target) {
                System.out.println("找到了" + target + ",索引为:" + mid);
                break;
            } else if (target > arr2[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }
}

package com.study.search_sort;

/**
 * ClassName: ArrayExer01_2
 * Package: com.study.search_sort
 * Description:
 * <p>
 * 案例：数组的缩容：
 * <p>
 * 现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。
 *
 * @Author wkm
 * @Create 2023/4/8 20:29
 * @Version 1.0
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int deleteIndex = 4;
        //方式一:不新建数组
//        for (int i = deleteIndex; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        //修改最后一个元素
//        arr[arr.length - 1] = 0;
        //方式二:新建数组,长度减少
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            arr2[i] = arr[i];
        }
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr2[i] = arr[i + 1];
        }
        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

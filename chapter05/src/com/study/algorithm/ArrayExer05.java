package com.study.algorithm;

/**
 * ClassName: ArrayExer05
 * Package: com.study.algorithm
 * Description:
 * <p>
 * 案例：
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 如何实现数组元素的反转存储？你有几种方法。
 *
 * @Author wkm
 * @Create 2023/4/8 18:50
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //反转操作
        //方式1：
//        for(int i = 0;i < arr.length/2;i++){
//            //交互arr[i] 与 arr[arr.length - 1 - i]位置的元素
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }

        //方式3：不推荐
//        int[] newArr = new int[arr.length];
//        for(int i = arr.length - 1;i >= 0;i--){
//            newArr[arr.length - 1 - i] = arr[i];
//        }

//        arr = newArr;
        //方式2：
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //交互arr[i] 与 arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

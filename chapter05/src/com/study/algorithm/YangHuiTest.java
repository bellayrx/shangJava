package com.study.algorithm;

/**
 * ClassName: YangHuiTest
 * Package: com.study.algorithm
 * Description:
 * <p>
 * 案例：使用二维数组打印一个 10 行杨辉三角。
 * <p>
 * 提示：
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * @Author wkm
 * @Create 2023/4/8 0:29
 * @Version 1.0
 */
public class YangHuiTest {
    public static void main(String[] args) {
        //1. 创建二维数组
        int[][] yangHui = new int[10][];

        //2.使用循环结构，初始化外层数组元素
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //3. 给数组的元素赋值
            //3.1 给数组每行的首末元素赋值为1
            yangHui[i][0] = yangHui[i][i] = 1;
            //3.2 给数组每行的非首末元素赋值
            //if(i >= 2){
            for (int j = 1; j < yangHui[i].length - 1; j++) { //j从每行的第2个元素开始，到倒数第2个元素结束
                yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
            }
            //}

        }
        //遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

package com.hw._string;

/**
 * ClassName: leetcode06
 * Package: com.hw._string
 * Description:
 *
 * @Author wkm
 * @Create 2023/5/3 16:12
 * @Version 1.0
 */
public class leetcode06 {
    public String convert(String s, int numRows/*行数*/) {
        if (numRows == 1) return s;
        char[][] chs = new char[numRows][s.length()];
        //初始化数组
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                chs[i][j] = ' ';
            }
        }
        //填充数组
        int row = 0, col = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            chs[row][col] = s.charAt(i);
            if (flag) {
                //从上往下
                row++;
                if (row == numRows) {
                    flag = false;
                    row -= 2;
                    col++;
                }
            } else {
                row--;
                col++;
                if (row == -1) {
                    flag = true;
                    row += 2;
                    col--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (chs[i][j] != ' ') {
                    sb.append(chs[i][j]);
                }
            }
        }
        return sb.toString();
    }
}

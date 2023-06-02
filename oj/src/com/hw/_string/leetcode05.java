package com.hw._string;

/**
 * ClassName: leetcode05
 * Package: com.hw._string
 * Description:
 *
 * @Author wkm
 * @Create 2023/5/3 15:56
 * @Version 1.0
 */
public class leetcode05 {
    public String longestPalindrome(String s){
        int n =s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLen = 1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            dp[i][i]=true;
        }
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxLen=2;
            }
        }
        for (int j = 2; j < n; j++) {
            for (int i = 0; i < j-1; i++) {
                if (s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    if (j-i+1>maxLen){
                        maxLen=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}

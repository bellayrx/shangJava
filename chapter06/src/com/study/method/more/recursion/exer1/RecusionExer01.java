package com.study.method.more.recursion.exer1;

/**
 * ClassName: RecusionExer01
 * Package: com.study.method.more.recursion.exer1
 * Description:练习1：
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 * <p>
 * <p>
 * 练习2：
 * 已知有一个数列：f(0) = 1,f(1) = 4,
 * f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
 *
 * @Author wkm
 * @Create 2023/4/11 17:39
 * @Version 1.0
 */
public class RecusionExer01 {
    public int f1(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f1(n + 2) + f1(n + 1) * 2;
        }
    }

    public int f2(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return f1(n - 2) + f1(n - 1) * 2;
        }
    }

}

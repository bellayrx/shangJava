package com.study.thisstudy.exer;

/**
 * ClassName: BoyGirlTest
 * Package: com.study.thisstudy.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 11:18
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("e", 24);
        Gril gril = new Gril("d", 29);
        gril.marry(boy);
        boy.shout();
        Gril gril2 = new Gril("de", 20);
        System.out.println(gril.compare(gril2));
    }
}

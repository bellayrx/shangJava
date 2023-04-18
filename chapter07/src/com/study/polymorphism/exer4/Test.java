package com.study.polymorphism.exer4;

/**
 * ClassName: Tets
 * Package: com.study.polymorphism.exer4
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 11:31
 * @Version 1.0
 */
public class Test {
    public static void meeting(Person... ps) {
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
//            if (ps[i] instanceof Woman) {
//                ((Woman) ps[i]).makeup();
//            }
            //新写法 >JDK8的新特性
            if (ps[i] instanceof Woman w) {
                w.makeup();
            }
            if (ps[i] instanceof Man m) {
                ((Man) ps[i]).smoke();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Test.meeting(new Man(), new Woman(), new Man());
    }
}

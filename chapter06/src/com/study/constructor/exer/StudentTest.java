package com.study.constructor.exer;

/**
 * ClassName: StudentTest
 * Package: com.study.constructor.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 16:24
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("刘强东", 48, "中国人民大学", "社会学");
        System.out.println(s1);

        Student s2 = new Student("奶茶妹妹", 28, "清华大学");
        System.out.println(s2);
    }
}

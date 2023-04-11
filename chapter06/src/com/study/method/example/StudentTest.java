package com.study.method.example;

/**
 * ClassName: StudentTest
 * Package: com.study.method.example
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/11 9:19
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].score = (int) (Math.random() * 101);
            students[i].state = (int) (Math.random() * 6 + 1);
        }
        for (int i = 0; i < students.length; i++) {
            if (3 == students[i].state) {
                students[i].show();
            }
        }
        System.out.println("****************");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }


    }
}

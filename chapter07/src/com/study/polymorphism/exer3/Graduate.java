package com.study.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Package: com.study.polymorphism.exer3
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/18 11:18
 * @Version 1.0
 */
public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}

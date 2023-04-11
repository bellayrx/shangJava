package com.study.method;

/**
 * ClassName: MethodTest
 * Package: com.study.method
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/10 11:48
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {

    }
}

class Person1 {
    String name;
    int age;
    char gender;

    //方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人每天至少睡眠" + hour + "小时");
    }

    public String interests(String hobby) {
        String info = "我的爱好是" + hobby;
        System.out.println(info);
        return info;
    }

    public int getAge() {
        return age;
    }

}

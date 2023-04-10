package com.study.method;

/**
 * ClassName: FieldTest
 * Package: com.study.method
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/10 9:56
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name + "," + p1.age);
        p1.sleep(8);
    }
}

class Person {
    //属性
    String name;
    int age;
    char gender;

    //局部变量
    public void eat() {
        //局部变量
        String food = "宫保鸡丁";
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour) {
        //形参也属于局部变量
        System.out.println("每天睡" + hour + "小时");
        System.out.println(name);//覆盖了name的作用域
        //调不了方法，也调不了你
    }

}

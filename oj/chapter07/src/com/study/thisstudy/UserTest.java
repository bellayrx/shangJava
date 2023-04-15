package com.study.thisstudy;

/**
 * ClassName: UserTest
 * Package: com.study.thisstudy
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/14 11:19
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        //只创建了一个对象
        User user = new User("02", 10);

    }
}

class User {
    private String name;
    private int age;

    public User() {
        System.out.println("init");
    }

    public User(String name) {
        this();
        this.name = name;
        System.out.println("name");
    }

    public User(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void init() {
    }
}
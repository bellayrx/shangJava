package com.study.object;

import java.io.File;
import java.util.Objects;

/**
 * ClassName: UserTest
 * Package: com.study.object
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/19 14:42
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("u1", 12);
        User u2 = new User("u1", 12);
        System.out.println(u1.equals(u2));//false 判断的是地址值


        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//true

        File file = new File("d:\\abc.txt");
        File file2 = new File("d:\\abc.txt");
        System.out.println(file2.equals(file));

        //数组上使用equals()
        int[] arr = new int[10];
        System.out.println(arr.equals(new int[10]));
    }
}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写equals方法


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o instanceof User) {
//            User user = (User) o;
//            if (this.age == user.age && this.name.equals(user.name)) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }
    //idea 自动实现

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (age != user.age) {
            return false;
        }
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

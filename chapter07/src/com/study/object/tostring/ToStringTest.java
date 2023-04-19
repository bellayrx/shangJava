package com.study.object.tostring;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: ToStringTest
 * Package: com.study.object.tostring
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/19 15:45
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        System.out.println(u1.toString());//com.atguigu07.object.tostring.User@1b6d3586 --> User{ name = Tom, age = 12}
        System.out.println(u1);//com.atguigu07.object.tostring.User@1b6d3586 -> User{ name = Tom, age = 12}
        String s1 = new String("hello");
        System.out.println(s1.toString());

        File file = new File("d:\\abc.txt");
        File file2 = new File("d:\\abc.txt");
        System.out.println(file);
        System.out.println(file2.equals(file));

        Date date = new Date();
        Date date2 = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("date=:" + format);
        System.out.println(date.equals(date2));
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

    //手动实现toString()
//    @Override
//    public String toString() {
//        return "User{ name = " + name + ", age = " + age + "}";
//
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

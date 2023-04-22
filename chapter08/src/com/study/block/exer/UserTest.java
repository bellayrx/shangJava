package com.study.block.exer;

/**
 * ClassName: UserTest
 * Package: com.study.block.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/22 15:05
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user= new User();
        System.out.println(user);
        User user2= new User("tony","000000");
        System.out.println(user2);
        User1 user1 = new User1();
        System.out.println(user1);
    }
}

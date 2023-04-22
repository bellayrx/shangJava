package com.study.block.exer;

/**
 * ClassName: User
 * Package: com.study.block.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/22 15:00
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registerTime;

    public User() {
        System.out.println("新用户注册");
        registerTime = System.currentTimeMillis();//(距离1970.0.0 0时0分0秒到现在的毫秒数)
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User(String userName, String password) {
        System.out.println("新用户注册");
        registerTime = System.currentTimeMillis();//(距离1970.0.0 0时0分0秒到现在的毫秒数)
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegisterTime() {
        return registerTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "用户名='" + userName + '\'' +
                ", 密码='" + password + '\'' +
                ", 注册时间=" + registerTime +
                '}';
    }
}

package com.study.thisstudy.exer;

/**
 * ClassName: Gril
 * Package: com.study.thisstudy.exer
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/14 11:40
 * @Version 1.0
 */
public class Gril {
    private String name;
    private int age;

    public Gril() {
    }

    public Gril(String name, int age) {
        this.name = name;
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

    public void marry(Boy boy) {
        System.out.println("我想嫁" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较大小
     *
     * @param gril
     * @return
     */
    public int compare(Gril gril) {
        if (this.age > gril.age) {
            return 1;
        } else if (this.age < gril.age) {
            return -1;
        } else {
            return 0;
        }
    }

}

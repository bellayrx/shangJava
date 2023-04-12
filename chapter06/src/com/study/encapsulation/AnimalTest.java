package com.study.encapsulation;

/**
 * ClassName: AnimalTest
 * Package: com.study.encapsulation
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 11:44
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setName("蛤蟆");
        animal1.setLegs(4);
        System.out.println("name = " + animal1.getName() + ", legs = " + animal1.getLegs());
        animal1.eat();
    }
}

class Animal {
    private String name;
    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if (legs >= 0 && legs % 2 == 0) {
            this.legs = legs;
        } else {
            System.out.println("你输入的数据非法");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("动物觅食");
    }
}

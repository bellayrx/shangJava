package com.study.override.exercise1;

/**
 * ClassName: ManKind
 * Package: com.study.inherient.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:32
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWomen() {
        if (this.sex == 1) {
            System.out.println("man");
        } else if (this.sex == 0) {
            System.out.println("women");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}

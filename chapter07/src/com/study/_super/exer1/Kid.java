package com.study._super.exer1;

/**
 * ClassName: Kid
 * Package: com.study.inherient.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 16:35
 * @Version 1.0
 */
public class Kid extends ManKind {
    private int yearOld;

    public Kid() {

    }

    public Kid(int yearOld) {
        this.yearOld = yearOld;
    }

    public Kid(int sex, int salary, int yearOld) {
        this.yearOld = yearOld;
        setSex(sex);
        setSalary(salary);
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge() {
        System.out.println(yearOld);
    }

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("but kid should study");
    }
}

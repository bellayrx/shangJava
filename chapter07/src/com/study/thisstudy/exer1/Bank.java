package com.study.thisstudy.exer1;

/**
 * ClassName: Bank
 * Package: com.study.thisstudy.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 11:34
 * @Version 1.0
 */
public class Bank {
    private Custom[] customs;
    private int numberOfCustomer;

    public Bank() {
        customs = new Custom[10];
    }

    public Custom[] getCustoms() {
        return customs;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     *
     * @param firstName
     * @param lastName
     */
    public void addCustomer(String firstName, String lastName) {
        Custom custom = new Custom(firstName, lastName);
        customs[numberOfCustomer++] = custom;
    }

    public Custom getCustoms(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            return null;
        } else {
            return customs[index];
        }
    }
}

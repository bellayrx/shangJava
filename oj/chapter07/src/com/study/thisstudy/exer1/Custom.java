package com.study.thisstudy.exer1;

/**
 * ClassName: Custom
 * Package: com.study.thisstudy.exer1
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/15 11:27
 * @Version 1.0
 */
public class Custom {
    private String firstName;
    private String lastName;
    private Account account;

    public Custom(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}

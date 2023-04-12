package com.study.encapsulation;

/**
 * ClassName: Book
 * Package: com.study.encapsulation
 * Description:案例：自定义图书类
 * <p>
 * 设定属性包括：
 * 书名bookName，
 * 作者author，
 * 价格price；
 * <p>
 * 方法包括：
 * 相应属性的get/set方法，
 * 图书信息介绍等。
 *
 * @Author wkm
 * @Create 2023/4/12 15:07
 * @Version 1.0
 */
public class Book {
    private String bookName; //书名
    private String author; //作者
    private double price; //价格

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bn) {
        bookName = bn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    @Override
    public String toString() {

        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.study.encapsulation;

/**
 * ClassName: BookTest
 * Package: com.study.encapsulation
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 15:08
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setBookName("剑指Java");
        book1.setAuthor("尚硅谷教育");
        book1.setPrice(180.0);

        System.out.println(book1);
    }
}

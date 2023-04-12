package com.study.package_import;

import com.study.memory.Person;
import com.study.method.more.recursion.RecursionTest;
import com.study.method.more.recursion.exer2.RabbitExer;

import java.lang.reflect.Field;
import java.util.*;

import static java.lang.Math.PI;
import static java.lang.System.out;

/**
 * ClassName: PackageImportTest
 * Package: com.study.package_import
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 10:31
 * @Version 1.0
 */
public class PackageImportTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set = new HashSet();

        String str = "hello";
        out.println(str);

        Person p = new Person();

        Field field = null;

        RecursionTest test = null;

        RabbitExer exer = null;

        //Date可以使用import的方式指明
        Date date = new Date();

        //使用全类名的方式
        java.sql.Date date1 = new java.sql.Date(121231231L);

        out.println("hello");

        out.println(PI);
    }
}

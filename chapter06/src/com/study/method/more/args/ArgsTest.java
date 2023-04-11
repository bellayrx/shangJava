package com.study.method.more.args;

/**
 * ClassName: ArgsTest
 * Package: com.study.method.more.args
 * Description:用在数据库
 *
 * @Author wkm
 * @Create 2023/4/11 11:13
 * @Version 1.0
 */
public class ArgsTest {
    /*
    场景举例：
    * String sql = "update customers set name = ?,email = ? where id = ?";
    *
    * String sql1 = "update customers set name = ? where id = ?";
    *
    * public void update(String sql,Object ... objs);
    *
    * */
    public static void main(String[] args) {
        ArgsTest argsTest = new ArgsTest();
        argsTest.print();
        argsTest.print(1);
//        argsTest.print(1, 2);
        argsTest.print(new int[]{1, 23, 1, 3});
    }

    public void print(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println(111);
    }
//    public void print(int[] nums) {
//        System.out.println(111);
//    } 不是重载

    public void print(int nums, int... i) {
        System.out.println(333);
    }

//    public void print(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }


    //编译不通过
//    public void print(int ... nums,int i){
//
//    }

    //可以构成重载
    public void print(int nums) {
        System.out.println(222);
    }

    public void print(int i, int j) {
        System.out.println("3333");
    }
}

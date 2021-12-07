package com.seedling.part1;

public class Demo_method3 {

    public static void test1(){
        System.out.println("test1()........");
    }

    public static void test2(){
        test1();
        System.out.println("test2()........");
        test3();
    }

    public static void test3(){
        test1();
        System.out.println("test3()........");
    }



    public static void main(String[] args) {//程序的主入口

        test1();
        System.out.println("----------------");
        test2();
        System.out.println("----------------");
        test3();

    }
}

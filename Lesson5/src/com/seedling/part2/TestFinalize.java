package com.seedling.part2;

public class TestFinalize {
    public static void main(String[] args) {

        new Student();
        new Student();
        new Student();

        System.out.println("-------------");

        //手动GC
        System.gc();

    }
}

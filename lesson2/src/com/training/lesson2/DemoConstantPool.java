package com.training.lesson2;

public class DemoConstantPool {
    public static void main(String[] args) {

        Integer i1 = new Integer(127);

        System.out.println(i1);
        System.out.println(i1.hashCode());
        System.out.println(System.identityHashCode(i1));
        System.out.println("-------------");

        Integer i2 = new Integer(127);
        System.out.println(i2);
        System.out.println(i1.hashCode());
        System.out.println(System.identityHashCode(i2));
        System.out.println("-------------");

    }
}

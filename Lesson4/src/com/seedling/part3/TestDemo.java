package com.seedling.part3;

/**
 * 同一个包，不同类
 */
public class TestDemo {
    public static void main(String[] args) {
        Test t = new Test();
        //System.out.println("age:"+t.age);private 修饰，同一个包，不同的类，不能访问
        System.out.println("i:"+t.i);//default 修饰，同一个包，不同的类，可以访问
        System.out.println("j:"+t.j);//protected 修饰，同一个包，不同的类，可以访问
        t.print();;//public 修饰，同一个包，不同的类，可以访问
    }
}

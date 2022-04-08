package com.seedling.part3.other;

import com.seedling.part3.Test;

/*
不同的类，不同的包
 */
public class TestDemo2 {
    public static void main(String[] args) {

        Test t = new Test();

        //System.out.println("i:"+t.i);//default 修饰，不同包，不同的类，不能访问
        //System.out.println("j:"+t.j);//protected 修饰，不同包，不同的类，不能访问(限于子类访问)
        t.print();;//public 修饰，不同包，不同的类，，可以访问

    }
}

package com.training.lesson2;

/**
 * java中的数据类型的转换
 */
public class DemoType {
    public static void main(String[] args) {
        byte a = 123;
        short s = a;//隐式的自动类型转换；
        int i = s;

        System.out.println("a:"+a);
        System.out.println("s:"+s);
        System.out.println("i:"+i);

        int i2 = 128;
        byte b2 = (byte)i2;//强制类型转换：会有数据溢出
        int i3 = 129;
        byte b3 = (byte)i3;

        double d1 = 6.7;
        int i4 = (int)d1;
        System.out.println("b2:"+b2);
        System.out.println("b3:"+b3);

        System.out.println("i4:"+i4);

        System.out.println("----------------------");

        //特殊点1：byte,short,char这三种在运算的时候，会自动转成int;
        // byte a1 = 12;
        // byte a2 = 13;
        // byte bb = a1+a2;

        //特殊点2：
        long l1 = 100L;
        long l2 = 100;//int---->long自动类型转换
    }
}

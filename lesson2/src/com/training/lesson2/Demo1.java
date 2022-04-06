package com.training.lesson2;

/**
 * java的数据类型：
 *
 * 变量的语法格式：
 * 数据类型 变量名 = 赋值;
*/
public class Demo1 {
    public static void main(String[] args) {
        byte b1 = 123;      //赋值就是存数据
        short s1 = 200;
        int i1 = 300;      //默认int;
        long l1 = 1000L;//long类型后面要写上大写的L或者小写的l

        //访问变量就是取数据
        System.out.println("b1:"+b1);//+是表示字符串的拼接
        System.out.println("s1:"+s1);
        System.out.println("i1:"+i1);
        System.out.println("l1:"+l1);

        b1 = 120;

        System.out.println("-------------------------");
        float f1 =3.14f;//用小写的f或者大写的F标识这是float类型
        double d1 = 3.149;//小数的类型默认为double

        System.out.println("f1:"+f1);
        System.out.println("d1:"+d1);

        System.out.println("-------------------------");
        boolean bb1 = true;
        boolean bb2 =false;
        System.out.println("bb1:"+bb1);
        System.out.println("bb2:"+bb2);
        System.out.println("-------------------------");

        char c1 = 'A';
        char c2 = '中';
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
    }
}

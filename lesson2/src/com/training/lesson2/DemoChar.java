package com.training.lesson2;

/**
 * 字符类型
 */
public class DemoChar {
    public static void main(String[] args) {
        char c1 ='1';
        char c2 = 97;//char类型的数字1对应ascii对应的一个字符，
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);

        System.out.println("-------------------");
        //转义字符
        System.out.println("\"hello,world\"");
        System.out.println("\'hello,world\'");

        System.out.println("\"hello,\nworld\"");
        System.out.println("\"hello,\tworld\"");
    }
}

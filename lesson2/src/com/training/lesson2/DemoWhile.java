package com.training.lesson2;

/**
 * 循环结构： while
 */
public class DemoWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("退出循环的时候i的值："+i);
    }
}

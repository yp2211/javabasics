package com.training.lesson2;

/**
 * 循环中的return
 */
public class DemoReturn {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            if (i == 2) {
                return;
            }

            System.out.println(i);
        }
    }
}

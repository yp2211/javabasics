package com.training.lesson2;

/**
 * 循环中的continue
 */
public class DemoContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 2) {
                    continue;//只用于结束某一次循环
                }
                System.out.println("j:" + j);
            }

            System.out.println(i);
        }
    }
}

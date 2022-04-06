package com.training.lesson2;

/**
 * 循环语句和分支语句的结合
 */
public class DemoForIf {
    public static void main(String[] args) {
        System.out.println("1-100内所有的偶数：");
        for(int i = 1; i <= 100; i++) {
            //i=1;i%2!=0,所以 i%2==0不成立
            //i=2;i%2==0,所以 i%2==0成立
            //.....
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

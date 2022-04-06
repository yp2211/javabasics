package com.training.lesson2;

/**
 * 循环结构： do ... while ...
 */
public class DemoDoWhile {
    public static void main(String[] args) {
        /*
        * 求1-5的和
        */
        int i = 1;
        int sum = 0;
        do {
            sum += i; //+1+2+3+4+5
            i++;//2,3,4,5,6
        } while (i < 6);

        System.out.println("sum:" + sum);
    }
}

package com.training.lesson2;

/**
 * 循环当中的break;
 */
public class DemoBreak {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println("j:" + j);

                /*
                i=1

                i=2

                i=3

                i=4

                i=5

                */
//                 if(i == 5){
//                    break;//i==5的时候，跳出循环；
//                 }
//
//                System.out.println(i);
            }
        }
    }
}

package com.training.lesson2;

/**
 * 值运算符
 * =:
 * +=
 * -=
 * *=
 * /=
 * %=
 */
public class Demo4Assign {
    public static void main(String[] args) {
        int i = 10;//相当于把右边的值赋值给左边的变量

        i +=2;//i = i+2; 12
        System.out.println(i);


        i -=4;//i = i-4; 8
        System.out.println(i);

        i *=2;//i = i*2 ; 16
        System.out.println(i);

        i /= 3;//i = i/3;5
        System.out.println(i);
        i %= 1;//i = i%1;0
        System.out.println(i);
        int a = 16;
        a += a++;//a =a +(a++)

        System.out.println("a="+a);
    }
}

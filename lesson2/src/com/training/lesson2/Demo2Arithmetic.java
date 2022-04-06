package com.training.lesson2;

/**
 * 算术运算符
 */
public class Demo2Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j =3;

        int div =10/3;
        int mod = 10%3;
        System.out.println("div:"+div);
        System.out.println("mod:"+mod);

        int a = 10;
        System.out.println("a:"+a);
        a++;
        System.out.println("a:"+a);//?
        a--;
        System.out.println("a:"+a);//?


        int b = 3;
        ++b;
        System.out.println("b:"+b);
        --b;
        System.out.println("b:"+b);

        System.out.println("----------------------------");

        int c =3;
        int d =3;
        System.out.println(c++);
        System.out.println(++d);

        int x = 3;
        int y = 10;
        int result1 = ++x + y++;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("result1:"+result1);

        x= 3;
        y = 4;
        int res1 = (x++)*(--y)-(++x)/(--y);

        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("res1:"+res1);
    }
}

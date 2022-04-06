package com.training.lesson2;

/**
 * 逻辑运算符：操作的是布尔值之间的运算
 */
public class DemoLogic {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        boolean result1 = b1 & b2 & b3;//逻辑与运算，只有有一个false,那么就返回false
        System.out.println(result1);

        boolean result2 = b1 | b2; //逻辑或运算 ，只有一个true ,就返回true;
        boolean result3 = b2 | b4; //两个都是false,才返回false;
        System.out.println(result2);

        System.out.println(result3);
        boolean result6 = b1 ^ b2;
        System.out.println(result6);

        boolean result7 = !(b1 & b2 & b3);
        System.out.println("result7:"+result7);
        int a =3;
        int b =4;

        boolean result4= (a++<3)&&(b++>4);//短路&&，遇到一个false,就返回false,后面的不再执行
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        boolean result5= (a++>2)||(b++>4);//短路||，遇到一个true,就返回true,后面的不再执行
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}

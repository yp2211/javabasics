package com.seedling.part1;

public class Demo_overload {

    //方法的重载：同一个类中，方法名相同，参数列表不一样(个数，顺序，类型)
    //
    public static int getSum(int a,int b){
        return a+b;
    }

    //这个不是重载
//    public static int getSum(int m,int n){
//        return m+n;
//    }

    //
    public static double getSum(double a,double b){
        return a+b;
    }


    public static int getSum(int a,int b,int c) {
        return a + b + c;
    }

//     int getSum(int a,int b,int c) {
//        return 'c';
//    }


    public static void main(String[] args) {

        getSum(3,5);

    }
}

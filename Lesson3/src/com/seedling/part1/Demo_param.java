package com.seedling.part1;

public class Demo_param {

    //
    public static void printShape(int n,int m,char c){
        //打印一个直角三角形
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }

    public static void main(String[] args) {


        printShape(8,20,'c');//实参和形参要一一对应，参数的个数，类型，顺序都要一一对应

    }
}

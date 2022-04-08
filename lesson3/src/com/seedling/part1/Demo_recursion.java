package com.seedling.part1;

public class Demo_recursion {


    //
    public static void test1(int n){
        System.out.println("test1()......");
        if(n==1){
            return;//方法的出口
        }
        test1(n-1);//递归，自己调用自己,递归一定要有出口
        //test1(4)
        //test1(3)
        //test1(2)
        //test1(1)
    }

    //有返回值的递归方法
    public static int getSum(int n){
//        int sum = 0;
//        for (int i = 0; i <= 5; i++) {
//            sum +=i;
//        }
//        return sum;
        if(n==1){
            return 1;
        }
        return getSum(n-1)+n;
    }

    public static void main(String[] args) {

        test1(5);

        //用递归的方式来求1-5之间的和
//        getSum(5)---->getSum(4)+5;
//        getSum(4)---->getSum(3)+4;
//
//        getSum(3)---->getSum(2)+3;
//        getSum(2)---->getSum(1)+2;
//        getSum(1)----->return 1;

        System.out.println("------------------------");
        int sum = getSum(5);
        System.out.println("sum:"+sum);


    }
}

package com.seedling.part1;



public class Demo_return {

    //1,如果声明了有返回值，那么必须使用return
    public static double getNum(){

        return 3;//兼容的数据类型，会发生的隐式类型转换
    }

    //2.定义方法的时候，声明的返回值类型，一定得和return后实际上返回的数值类型一致。
    public static long getNum2(){
        byte b = 34;
        return b;
    }

    //3.如果一个方法声明了有返回值，如果方法中有分支语句或者循环语句，那么要保证无论执行哪个分支，都要有return可以被执行到。
    public static int getNum3(){
        int num = 34;
//        if(num>0){
//            return num;
//        }else{
//            System.out.println("num:"+num);
//            return 0;
//        }

        for (int i = 0; i < 5; i++) {
            if(i==2){
                return i;
            }


        }

        return 0;
    }

    //4.如果一个方法声明没有返回值(void)，那么方法中也可以使用return语句，用于强制结束方法的执行。
    public static void getNum4(){
        int num =  12;
        if(num>10){//如果符合条件，那么就会进入分支，然后执行return ,结束方法的执行
            return;
        }
        System.out.println("hello,num:"+num);
    }


    public static void main(String[] args) {


        getNum4();;

    }
}

package com.seedling.part1;

public class Demo_method2 {

    //step1:打印5次HelloWorld
    public  void print(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello,world!!");
        }
    }

    public static void main(String[] args) {


        //step2:非static方法的调用

        //1,创建对象
        Demo_method2 obj = new Demo_method2();
        //2,用对象名.方法名();
        obj.print();
    }
}

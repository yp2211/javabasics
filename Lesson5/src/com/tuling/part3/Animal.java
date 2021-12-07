package com.tuling.part3;

class Cat extends Animal{//要么就要实现抽象方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼.....");
    }

    @Override
    public void run() {
        System.out.println("猫跑起来....");
    }
}

abstract  class Dog extends Animal{//如果不想实现抽象方法，那么可以将自己定义成抽象类

}


public abstract  class Animal {//有抽象方法一定要定义成抽象类
    //成员变量
    private int age;
    private String color;
    //构造函数
    public Animal(){}

    //抽象方法
    public abstract void eat();

    //抽象方法
    public abstract  void run();

    //成员方法
    public void print(){
        System.out.println("name.....");
    }


    //类方法
    public static  void test(){

    }
}

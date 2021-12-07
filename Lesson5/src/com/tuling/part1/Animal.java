package com.tuling.part1;

import java.util.Objects;

class Cat extends Animal{
    //新增的属性
    private String color;

    @Override
    public void run(){
        System.out.println("猫跑起来.....");
    }

    //
    public void catchMouse(){
        System.out.println("抓老鼠......");
    }

}

class Dog extends Animal{
    //新增的属性
    private String kind;

    @Override
    public void run(){
        System.out.println("狗狗跑起来......");
    }

    public void keepDoor(){
        System.out.println("看门........");
    }
}

public class Animal {
    //成员变量
    private String name;
    private int age;

    public void run(){
        System.out.println("动物跑起来......");
    }


}

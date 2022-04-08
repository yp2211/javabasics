package com.seedling.part2;

public class Animal {
    private String type;
    int age;
    String color;

    public Animal(){
        System.out.println("父类Animal无参构造函数......");
    }

    public Animal(String type, int age, String color) {
        System.out.println("父类Animal有参构造函数......");
        this.type = type;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("动物吃东西.....");
    }

    public void print(){
        System.out.println("type:"+type+";age:"+age+";color:"+color);
    }


}

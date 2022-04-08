package com.seedling.part2;

class Man extends Person{
    //将父类已经有的方法重新实现
    @Override
    public void eat(){
        System.out.println("Man类eat()方法.....");
    }

    @Override//约束我们一定要符合重写的规则
    public Man getType(){
        System.out.println("Man类的getType()方法.....");
        return null;
    }
}

public class Person {
    String name;

    public void eat(){
        System.out.println("Person类eat()方法.....");
    }


    public Person getType(){
        System.out.println("Person类的getType()方法.....");
        return null;
    }

}

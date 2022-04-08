package com.seedling.part4;

//class Dog extends Animal{//final修饰的类不能被继承
//
//    //final修饰的方法不能被重写
//    public void eat(){
//
//    }
//}

public final class Animal {

    private String name;

    //静态的常量
    public static final double PI = 3.1415;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void eat(){
        System.out.println("动物吃东西......");
    }
}

class TestAnimal{

    public static void main(String[] args) {
        //final修饰基本数据类型
        final int age = 23;//常量：final修饰基本类型：值不可变
        System.out.println("age:"+age);

//        age = 34;
//        System.out.println("age:"+age);

        final Animal a = new Animal();//final修饰引用类型：地址不可变
        a.setName("woowow");
        //
        //a = new Animal();

        a.setName("12121212");


    }

}

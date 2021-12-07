package com.seedling.part2;

//继承父类非私有的属性和方法
public class Cat extends Animal{


    public Cat(){
        System.out.println("子类Cat无参构造......");
    }

    public Cat(String type,int age,String color,String name){
        super(type,age,color);//super()指代父类构造函数的时候，也只能放在第一句，如果显式调用了某个构造函数，就不会默认调用无参构造了
        System.out.println("子类Cat有参构造函数......");

//        this.age = age;
//        this.color = color;
        this.name = name;
    }

    //新增一些属性和方法
    String name;

    //重新实现父类的方法
//    @Override//相当于加了约束，
//    public void eat(){
//        System.out.println("猫吃鱼........");
//    }

    public void catchMouse(){
        System.out.println("抓老鼠......");
    }

}

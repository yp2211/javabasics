package com.seedling.part1;

public class Person {





    private String name;
    private int age;

    //private String city;//所属城市
    static String city;//用static修饰的属性，只有一份数据，被所有的对象共享

    //static修饰属性的时候，一般和final一起使用,形成静态常量
    static final double PI = 3.1415;

    //直接写的类里面的，每次创建对象都会执行，而且是在构造函数之前执行
    {
        System.out.println("构造代码块......");
    }

    public Person(){}
    public Person(String name,int age){
        System.out.println("有参构造函数.........");
        this.name = name;
        this.age = age;
    }


//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

    //生成了setter,getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void test(){
        System.out.println("test().......");
    }

    public void print(){
        //可以访问成员变量，类变量
        System.out.println("name:"+name+";"+"age:"+age+";city:"+city);
        //可以访问成员方法，类方法
        staticDemo();
        test();

    }

    public static void staticDemo(){
        System.out.println("staticDemo()......");
    }


    //静态的方法，也叫类方法
    public static void staticMethod(){
        //不能直接访问成员变量
//        System.out.println("name:"+name);
//        System.out.println("age:"+age);
        //可以访问静态属性
        System.out.println("city:"+city);

        //不能直接访问成员方法
//        print();
        //可以访问静态的方法
        staticDemo();
    }
}

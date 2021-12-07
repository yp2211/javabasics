package com.seedling.part1;

public class StaticDemo {


    //静态代码块，在main方法之前就执行，而且只执行一次
    static{

        System.out.println("静态代码块......");

    }




    public static void main(String[] args) {//main方法是程序的入口
        //访问的时候,通得类名直接访问
        Person.city = "Tokyo";

        System.out.println("PI:"+Person.PI);


        Person p1 = new Person("yamada",23);
        //p1.setCity("Tokyo");
        p1.print();


        System.out.println("-----------------------");
        Person.city = "Osaka";
        Person p2 = new Person("hanako",45);
        p2.print();
        //p2.setCity("Tokyo");

        System.out.println("---------------------");



        Person p3 = new Person("zhangsan3",45);
        p3.print();
        //p3.setCity("changsha");

        //访问静态方法
        Person.staticMethod();;


        System.out.println("-----------------------------------------------------------");


    }
}

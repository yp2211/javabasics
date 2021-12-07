package com.seedling.part2;

public class TestCat {
    public static void main(String[] args) {


        Cat cat1 = new Cat();
        //cat1.type="猫类";
        //继承父类的属性和方法
        cat1.age = 2;
        cat1.color = "白色";
        cat1.print();
        cat1.eat();//调用父类的方法，如果子类没有重新实现，那么会调用父类的；如果重写了，会调用自己的方法
        System.out.println("---------------------");
        //访问新增的属性和方法
        cat1.name = "hellokity";
        cat1.catchMouse();

        System.out.println("============================");

        //
        Cat cat2 = new Cat("狗狗类",2,"黑色","小4");
        cat2.print();

    }
}

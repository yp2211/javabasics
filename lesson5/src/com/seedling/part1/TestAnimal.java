package com.seedling.part1;

public class TestAnimal {

    public static void show(Animal animal){
        animal.run();
        //没有办法访问子类新增的方法
//        animal.catchMouse();
//        animal.keepDoor();
        if(animal instanceof Cat){
            Cat catObj = (Cat)animal;//向下转型
            catObj.catchMouse();
        }else if(animal instanceof Dog){
            Dog dogObj = new Dog();
            dogObj.keepDoor();
        }


    }

    public static void main(String[] args) {

//        Animal animal = new Animal();
//        animal.run();
//
//        System.out.println("-------------------------");

//        Cat cat = new Cat();
//        cat.run();

        System.out.println("----------------------------");

        //这个就是Java面向对象的里面的多态
        Animal cat = new Cat();//向上转型
        //animal1.run();//Cat类的run方法
        System.out.println("------------");
        Animal animal2 = new Animal();
        //animal2.run();//Animal类的run方法
        System.out.println("------------");
        Animal dog = new Dog();
        //animal3.run();;//Dog类的run方法

        System.out.println("===========================");
        show(cat);
        System.out.println("----------------");
        show(animal2);
        System.out.println("----------------");
        show(dog);


        System.out.println("--------------------------------------------------------------------");

        Animal animalObj = new Animal();
        //向下转型
        if(animalObj instanceof Cat){
            Cat catObj = (Cat)animalObj;
            catObj.catchMouse();
        }



    }
}

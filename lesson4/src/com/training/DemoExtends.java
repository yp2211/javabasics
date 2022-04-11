package com.training;


public class DemoExtends {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.eat();
        cat.work();
        System.out.println(cat.type);

        Dog dog = new Dog("Bloot");
        dog.eat();
        dog.work();
        System.out.println(dog.type);

        Rat rat = new Rat("Jerry");
        rat.eat();
        rat.work();
        System.out.println(rat.type);

        Tiger tiger = new Tiger("Tiger");
        tiger.eat();
        tiger.work();

        System.out.println("---------------");
//        System.out.print(cat + java.security.AccessController.doPrivileged(
//                new sun.security.action.GetPropertyAction("line.separator")));
        System.out.print(cat + MyConstants.STR_ENTER);
//        System.out.print(cat);
        System.out.println("---------------");

    }
}

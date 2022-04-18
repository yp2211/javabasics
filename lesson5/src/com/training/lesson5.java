package com.training;

import sun.misc.GC;

public class lesson5{
    public static void main(String[] args) {
        Animal animal1;
        animal1 = new Cat("Tom");
        show(animal1);

        Animal animal2 = new Dog("Bloot");
        show(animal2);

        Animal animal3 = new Mouse();
        animal3.name = "Jerry";
        show(animal3);

        Animal animal4;
        animal4 = new Cat("Mike");
        show(animal4);

        testObject(animal1);

        Person person = new Student();
        person.eat();

        IHuman iHuman = new Teacher();
        System.out.println(IHuman.VERSION);

    }

    static void show(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.sleep();
        }
        animal.work();
        System.out.println(animal.getClass());
    }

    static void testObject(Object object) {
        System.out.println(object.getClass());
    }
}

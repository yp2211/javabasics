package com.seedling.part2;

public class TestPerson {
    public static void main(String[] args) {

        Person p = new Person();
        p.eat();;
        p.getType();
        System.out.println("--------------------------");
        Man man = new Man();
        man.eat();;
        man.getType();

    }
}

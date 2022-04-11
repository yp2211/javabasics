package com.training;

public class Dog extends Animal{
    protected String type = "DOG";

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(title+ " " + name + " is eating bone.");
    }

    @Override
    public void work() {
        System.out.println(title+ " " + name + " is guarding.");
    }
}

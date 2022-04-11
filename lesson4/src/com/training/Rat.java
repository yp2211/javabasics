package com.training;

public class Rat extends Animal {
    protected String type = "RAT";

    public Rat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(title+ " " + name + " is eating cheese.");
    }

    @Override
    public void work() {
        System.out.println(title+ " " + name + " is running away.");
    }
}

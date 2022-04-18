package com.training;

public class Cat extends Animal {
    protected String type = "CAT";

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(title+ " " + name + " is eating fish.");
    }

    @Override
    public void work() {
        System.out.println(title+ " " + name + " is catching rat.");
    }

    public void sleep(){
        try {
            System.out.println(title+ " " + name + " is going to sleep.");
            Thread.sleep(1000);
            System.out.println(title+ " " + name + " is waked up.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

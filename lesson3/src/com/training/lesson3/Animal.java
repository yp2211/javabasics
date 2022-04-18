package com.training.lesson3;

public class Animal {

    private String name;

    private boolean isMale = true;

    public static void DoSomeStaticFunction() {
        System.out.println("You are calling DoSomeStaticFunction.");
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    public boolean getIsMale() {
        return this.isMale;
    }

    public static boolean isAlive = true;

    public Animal() {
        this.name = "none";
    }

    public Animal(String name) {
        if (Animal.isAlive) {
            this.name = name;
        } else {
            this.name = "dead";
        }
    }

    public void doWork() {
        // 1st step
        printName();

        // 2nd step
        printSucceed();
    }

    private void printName() {
        if (this.isMale) {
            System.out.println("I'm Mr. " + this.name);
        } else {
            System.out.println("I'm Ms. " + this.name);
        }
        return;
    }

    private void printSucceed() {
        System.out.println("Succeed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

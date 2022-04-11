package com.training;

public class Animal {
    String defaultVar = "";

    /**
     * private
     * protected
     * public
     */

    public String name = "None";
    public boolean isMale = true;
    public String title;
    private String CLASS_ID = "XXXXXXX";

    protected String type = "ANIMAL";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        if (isMale) {
            this.title = "Mr.";
        } else {
            this.title = "Miss";
        }
    }

    public void eat() {
        System.out.println(title+ " " + name + " is eating.");
    }

    public void work() {

    }

    public String toString() {
        return String.format("{'Name': %s, 'isMale': %s}", this.name, this.isMale);
    }

}

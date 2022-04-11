package com.training;

public class AnimalOld {

    public static String name = "None";
    public static boolean isMale = true;
    public static String title;
    private String type;
    private String CLASS_ID = "XXXXXXX";

    static {
        isMale = true;
        System.out.println("My name is " + name);
    }

    {
        System.out.println("This is a code block1.");
    }

    {
        System.out.println("This is a code block2.");
    }

    public AnimalOld() {
    }

    public AnimalOld(String name) {
        AnimalOld.name = name;
        if (isMale) {
            AnimalOld.title = "Mr.";
        } else {
            AnimalOld.title = "Miss";
        }
    }

    public void eat() {
        switch (this.type) {
            case "CAT":
                System.out.println(title+ " " + name + " is eating fish.");
                break;
            case "DOG":
                System.out.println(title+ " " + name + " is eating bone.");
                break;
            default:
                System.out.println(title+ " " + name + " is eating.");
        }
    }

    public void work() {

    }

    public void setType(String type) {
        this.type = type;
    }
}

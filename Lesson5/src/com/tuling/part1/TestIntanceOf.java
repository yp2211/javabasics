package com.tuling.part1;

public class TestIntanceOf {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        boolean result = cat instanceof Dog;
        System.out.println("result:"+result);

    }
}

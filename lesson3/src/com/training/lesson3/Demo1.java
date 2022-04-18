package com.training.lesson3;

public class Demo1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("Tom");
        a1.setIsMale(true);

        String name = a1.getName();

        Animal a2 = new Animal("Jerry");
        a2.setIsMale(false);

        a1.doWork();
        a2.doWork();

        //调用静态的方法：类名.方法名
        Animal.DoSomeStaticFunction();

        //
        NoConstruction noConstruction = new NoConstruction();
        System.out.println(noConstruction);
    }
}

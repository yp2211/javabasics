package com.training.lesson3;

public class DemoStatic {
    public static void main(String[] args) {
        Animal tom = new Animal("tom");
        tom.setIsMale(false);
        tom.doWork();

        Animal jerry = new Animal("jerry");
        jerry.setIsMale(true);
        System.out.println(jerry.getIsMale());

        jerry.doWork();

//        // Static function
//        DemoFunction.main(args);
//
//        // Function
//        DemoFunction demoFunction = new DemoFunction();
//        demoFunction.Calc(0);
    }

}

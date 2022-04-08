package com.training.lesson3;

public class DemoFunction {

    public static int _age = 40;

    public static void main(String[] args) {
//        DemoFunction demoFunctionY = new DemoFunction();
//        System.out.println(demoFunctionY.Calc(1024));


        // 2^31 - 1
        long l = 1 << 30;

        System.out.println(l * 2 * 2 - 1);

//        DemoFunction demoFunctionD = new DemoFunction();
//        System.out.println(demoFunctionD.Calc(2022));

    }

    public int Calc(int firstYear) {
        System.out.println(firstYear);
        return (firstYear > 0) ? Calc(firstYear >> 1) : 0;
    }

    public int Calc() {
        return 2022;
    }


    public DemoFunction getDemoFunction() {
        return this;
    }

    public int getAlive() {
        String s = "1";
        return Integer.parseInt(s);
    }
}

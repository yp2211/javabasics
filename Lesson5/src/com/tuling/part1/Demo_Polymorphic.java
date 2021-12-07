package com.tuling.part1;

class A{

    public void print(){
        System.out.println("print:A");
    }
}

class B extends A{


    @Override
    public void print(){
        System.out.println("print:B");
    }

    public void funB(){
        System.out.println("funB().....");
    }
}

class C extends A{
    @Override
    public void print(){
        System.out.println("print:C");
    }

    public void funC(){
        System.out.println("funC().....");
    }
}

public class Demo_Polymorphic {

    public static void test(A a){
        a.print();
        if(a instanceof B){
            B b = (B)a;
            b.funB();
        }
    }

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.getClass());


        A b = new B();
        System.out.println(b.getClass());
        C c = new C();

        test(a);
        test(b);
        test(c);


    }
}

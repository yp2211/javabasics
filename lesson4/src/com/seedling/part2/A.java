package com.seedling.part2;

//实际开发不建议这么写，
class B extends A{

    int i;//和父类有相同的属性

    public void testB(){
        System.out.println("i:"+super.i);//要想访问父类的属性，那么就用super
        System.out.println("j:"+j);

        //访问父类的fun方法
        super.fun();
    }

    public void fun(){
        System.out.println("子类的fun方法....");
    }
}

public class A {
    int i;
    int j;

    public void testA(){
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }

    public void fun(){
        System.out.println("父类的fun方法....");
    }
}



package com.seedling.part3;

public class Test {
    private int age;//private 只能在本类中访问

    int i;//default：什么都不写，就是default。同类，同包。

    protected int j;//protected：受保护的，同类，同包，不同包(限于子类访问)

    public void print(){//public：公共的，同类，同包，不同包。
        System.out.println("age:"+age);
    }
}

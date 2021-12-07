package com.tuling.part4;

interface Fu1{

    //public Fu1(){}
    void fun1();
}



interface Fu2{
    void fun2();
}

interface Children extends Fu1,Fu2{
    void childFu1();
}

class Fu{

}

//一个类可以实现多个接口
//一个类继承类同时可以实现接口
//接口的多继承
public class Zi extends Fu implements Children{

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void childFu1() {

    }
}

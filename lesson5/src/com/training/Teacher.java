package com.training;

public class Teacher extends Person {
    @Override
    public void eat() {
        System.out.println("教工食堂");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void hitDd() {

    }

    @Override
    public void  work() {
        System.out.println("备课");
    }
}

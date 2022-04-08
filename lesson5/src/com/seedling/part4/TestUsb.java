package com.seedling.part4;

public class TestUsb {
    public static void main(String[] args) {
        //接口不能实例化
        //Usb usb = new Usb();
        Usb mouse = new Mouse();
        mouse.start();
        mouse.stop();
        System.out.println("----------------------");
        //默认的方法
        mouse.fun1();
        System.out.println("----------------------");
        //静态的方法一定要用接口名去调用
        Usb.fun2();

    }
}

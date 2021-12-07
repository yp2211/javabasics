package com.tuling.part4;


class Mouse implements Usb{

    @Override
    public void start() {
        System.out.println("鼠标开始工作");
    }

    @Override
    public void stop() {
        System.out.println("鼠标结束工作");
    }

    //重写了
    @Override
    public void fun1() {
        System.out.println("鼠标的默认方法....");
    }
}

class Keyboard implements Usb{

    @Override
    public void start() {
        System.out.println("键盘开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("键盘结束工作...");
    }


}





//接口
public interface Usb {

    //静态的常量
    public static final double PI=3.14;//定义的变量会默认加上public static final

    //开始工作
    //public abstract  void start();
    //含有抽象方法；
    void start();

    //结束工作
    void stop();

    //默认的方法
    public default void fun1(){
        System.out.println("默认方法。。。。");
    }

    //静态的方法

    public static void fun2(){
        System.out.println("静态的方法");
    }

    //1.9时候
//    private void fun3(){
//
//    }

}

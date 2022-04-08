package com.seedling.part1;

public class Demo_method {

    /*
    [修饰符1,修饰符2...] 返回值/void 方法名(参数列表){
    .....
        return
    }
     */
    //public static void main(String[] args)

    //step1: 定义方法

    //方法名：标识符，尽量见名知意，驼峰命名法，动宾结构
    public static void getSum(){
        int sum = 0;
        for (int i = 0; i <=10; i++) {
            sum  +=i;
        }
        System.out.println("1-10之间的和："+sum);

    }
    //定义有返回值的方法
    public static int getSum2(){
        int sum = 0;
        for (int i = 0; i <=10; i++) {
            sum  +=i;
        }

        return sum;//1，结束方法的执行；2，将值返回给方法的调用的地方
    }

    //定义有返回值有参数的方法
    public static int getSum3(int num){//形式参数
        int sum = 0;
        for (int i = 0; i <=num; i++) {
            sum  +=i;
        }

        return sum;
    }

    public static void main(String[] args) {

        //定义：是具有一段特殊功能的代码
        //求1-10之间的和

        int sum = 0;
        for (int i = 0; i <=10; i++) {
            sum  +=i;
        }
        System.out.println("1-10之间的和："+sum);


        System.out.println("hello,world!!");
        System.out.println("hello,world!!");

        //step2：方法的调用
        //没有返回值的方法：方法名();
        //求1-10之间的和

        //static方法的调用，当我在同一个类当中调用static方法的时候，可以省略这个方法
        Demo_method.getSum();

        System.out.println("hello,world!!");
        System.out.println("hello,world!!");

        //求1-10之间的和
        getSum();

        System.out.println("---------------------------------------------");

        //有返回值的方法的调用: 数据类型 变量 = 方法名();
        int result2 = getSum2();

        System.out.println("result2:"+result2);


        //有返回值有参数的方法的调用： 数据类型 变量 = 方法名(实际的参数);


        System.out.println("-----------------------------------------------");

        int result3 = getSum3(5);//实际参数
        int result4 = getSum3(20);

        System.out.println("1-5的和："+result3);
        System.out.println("1-20的和："+result4);

    }
}

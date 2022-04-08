package com.seedling.part2;

//step1:定义类
public class Person {
    /*
        [修饰符] class 类名{
        //1.属性字段：Field
        成员变量
        //2.成员方法：Method
        行为功能
        //3.构造方法：Constructor

    }
     */
    //属性，成员变量
    String name;//姓名
    int age;//年龄
    //.....

    /*
    [访问权限修饰符] 方法名(参数列表){

    }
     */

    //构造函数
    public Person(){//默认会提供无参构造方法
        this(22,"lilianjie");//当我创建对象的时候，给了默认的姓名和年龄
        System.out.println("无参构造函数......");
    }

    //有参构造：就是在创建对象的时候可以直接给成员变量赋值
//    public Person(int a,String n){
//        age = a;
//        name = n;
//    }


    public Person(int age, String name){
        //当局部变量和成员变量命名冲突的时候，通过this来区分：
        this(name);
        this.age = age;
//        this.name = name;

    }

    public Person(String name){
        this.name = name;

    }




    //行为:成员方法
    public void eat(){
        //局部变量
//        int num;
//        System.out.println("num:"+num);
        System.out.println("吃饭......");
    }

    public void sleep(){
        System.out.println("睡觉......");
    }

    //....

    public void study(){
        //通过this关键字访问成员变量
        System.out.println(name+"在学习");
    }

    public void work(){
        //通过this关键字访问成员方法
        study();
        System.out.println("在工作.....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.seedling.part2;

public class TestPerson {
    public static void main(String[] args) {
        //step2:创建对象
        //类名 对象名 = new 类名();
        Person person = new Person();
        //访问成员变量和成员方法
        //设值
//        person.age = 23;
//        person.name = "zhoujie";
//
//        //取值
//        System.out.println("person对象的姓名："+person.name);
//        System.out.println("person对象的年龄："+person.age);

        //
        person.eat();
        person.sleep();

        //注意点：成员变量的默认值
        System.out.println("person对象的姓名："+person.name);
        System.out.println("person对象的年龄："+person.age);

        System.out.println("------------------------------");

        Person p2 = new Person(45,"chenglong");
        System.out.println("p2对象的姓名："+p2.name);
        System.out.println("p2对象的年龄："+p2.age);

        System.out.println("-------------------------------");

        Person person2 = new Person(66,"lian");
        System.out.println("person2对象的姓名："+person2.name);
        System.out.println("person2对象的年龄："+person2.age);


        System.out.println("------------------------");

        person2.study();
        person2.work();


    }
}

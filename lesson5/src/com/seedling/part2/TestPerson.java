package com.seedling.part2;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 =new Person("wowo",23);
        Class<? extends Person> aClass = p1.getClass();//返回引用中存储的实际对象类型。

        System.out.println("aClass:"+aClass);

        Person p2 = new Person();

        Class<? extends Person> aClass1 = p2.getClass();
        System.out.println("aClass1:"+aClass1);

        Student stu = new Student();
        System.out.println(stu.getClass());

        System.out.println("-----------------------------------------------");

        System.out.println("p1.hashCode:"+p1.hashCode());//返回该对象的十进制的哈希码值。
        System.out.println("p2.hashCode():"+p2.hashCode());

        System.out.println("-------------------------------");


        System.out.println("p1:"+p1.toString());//有时候我们不知想看这个对象的全类名，我们想看这个对象的成员变量的值


        System.out.println("------------------------------------");


        Person person1 = new Person("zhangsan",23);
        Person person2 = new Person("zhangsan",23);

        System.out.println("person1 == person2:"+(person1 == person2));//==比较的是内存地址


        System.out.println("person1.equals(person2):"+(person1.equals(person2)));//我们比较两个对象，其实我们是想比较一下对象的成员变量的值是否相等




    }
}

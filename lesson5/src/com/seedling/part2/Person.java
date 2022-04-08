package com.seedling.part2;

import java.util.Objects;

class Student extends Person{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student finalize()方法。。。。。");
    }
}

public class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

//    @Override
//    public String toString() {
//        return "name:"+name+";age"+age;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /**
     equals重写步骤：
     比较两个引用是否指向同一个对象。
     判断obj是否为null。
     判断两个引用指向的实际对象类型是否一致。
     强制类型转换。
     依次比较各个属性值是否相同。
     */
//    @Override
//    public boolean equals(Object obj){
//        if(this==obj){
//            return true;
//        }
//        if(obj==null||this.getClass()!=obj.getClass()){
//            return false;
//        }
//        //向下转型是为了调用子类新增的属性和方法
//        Person person = (Person) obj;
//
//        if(this.getName().equals(person.getName())&&this.getAge()==person.getAge()){
//            return true;
//        }
//
//
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

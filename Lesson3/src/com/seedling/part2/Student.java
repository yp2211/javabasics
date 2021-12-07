package com.seedling.part2;

public class Student {
    //step1：用访问修饰符修饰成员变量，限于本类访问
    //3个成员变量
    private String stuNo;
    private int age;
    private char sex;


    public Student(){}
    public Student(String stuNo,int age,char sex){
        setStuNo(stuNo);
        setAge(age);
        setSex(sex);
    }

    //step2:提供设值取值相应的方法，setXXX,getXXX

    public void setAge(int age){
        //可以在setXXX方法当中设置一些规则
        if(age<0){
            System.out.println("age要设置的参数值不合理，请重新设置!!");
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }


    public void setStuNo(String stuNo){
        //有限制的规则，就写上；如果没有就直接赋值给成员变量
        this.stuNo = stuNo;
    }

    public String getStuNo(){
        return stuNo;
    }


    public void setSex(char sex){
        if(sex=='男'||sex=='女'){
            this.sex = sex;
        }else{
            System.out.println("sex性别字段赋值不合理，请重新设置");

        }
    }

    public char getSex(){
        return sex;
    }




    //成员方法：行为
    public void study(){
        System.out.println("学习.....");
    }

    public void play(){
        System.out.println("玩游戏.......");
    }

    //打印自己本身的属性
    public void print(){
        System.out.println("stuNo:"+stuNo);
        System.out.println("age:"+age);
        System.out.println("sex:"+sex);
    }

}

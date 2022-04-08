package com.seedling.part2;

public class TestStudent {
    public static void main(String[] args) {

        //1,创建对象
        Student student = new Student();
        //student.stuNo = "001";
        //student.age =  18;
        //student.sex = '男';

        student.setStuNo("001");
        student.setAge(18);
        student.setSex('r');
        student.print();

        System.out.println("---------------------------");
        Student stu2 = new Student();
//        stu2.stuNo = "002";
//        stu2.age =  20;
//        stu2.sex = '女';
        stu2.print();
    }
}

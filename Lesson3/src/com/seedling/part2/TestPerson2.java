package com.seedling.part2;

public class TestPerson2 {
    public static void main(String[] args) {
        int i = 5;

        i = test(i);

        System.out.println("main:" + i);


//        Person p1 = new Person(5,"王⼆狗");
//        Person p2 = new Person(12,"李晓华");
//
//        Person p3 = p1;
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        test2(p3);
//        System.out.println(p3);
//        System.out.println(p1);
//
//        System.out.println(p1.getName());
//        System.out.println(p3.getName());
    }


    public static int test(int i){
        System.out.println(i);
        i = 100;
        System.out.println(i);
        return i;
    }
    public static void test2(Person person){
        person.setName("wowo");
    }
}

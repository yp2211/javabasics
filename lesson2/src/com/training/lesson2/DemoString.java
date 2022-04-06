package com.training.lesson2;

public class DemoString {
    public static void main(String[] args) {
        String s;
        s = "abc";
//        s = "bcd";
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(System.identityHashCode(s));
        System.out.println("-------------");

        String s1 = new String("abc");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println("-------------");

        String s2 = "abc";
//        System.out.println(s2);
//        System.out.println(s2.hashCode());
//        System.out.println(System.identityHashCode(s2));
//        System.out.println("-------------");

        // ==

        String o = null;
        System.out.println(o);
        if ("admin".equals(s)) {
            System.out.println(s.equals(s1));
        }
//
//        int i = 1;
//
//        if (s == "abc") {
//
//        }

    }
}

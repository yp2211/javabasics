package com.training;

public class DemoString {
    private static final int LOOP_TIMES = 19999;

    public static void main(String[] args) {
        String a = "abc";


        long start = System.currentTimeMillis();
        System.out.println(start);
//        a = testString(a);
//        testStringBuilder(a);
        testStringBuffer(a);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("⽤时:"+(end-start));

    }

    private static String testString(String a) {
        for (int i = 0; i < LOOP_TIMES; i++) {
            a += i;
        }
        System.out.println(a);
        return a;
    }

    private static void testStringBuffer(String a) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a);
        for (int i = 0; i < LOOP_TIMES; i++) {
            stringBuffer.append(i);
        }
//        System.out.println(stringBuffer);
    }

    private static void testStringBuilder(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        for (int i = 0; i < LOOP_TIMES; i++) {
            stringBuilder.append(i);
        }
//        System.out.println(stringBuilder);
    }
}

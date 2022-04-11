package com.training;

public class MyConstants {
//    public static String STR_ENTER = "\r\n";
    public static final String STR_ENTER = java.security.AccessController.doPrivileged(
                new sun.security.action.GetPropertyAction("line.separator"));
}

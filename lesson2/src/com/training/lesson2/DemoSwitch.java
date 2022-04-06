package com.training.lesson2;

public class DemoSwitch {
    public static void main(String[] args) {

        /*
        switch(expression){
        case value :
        // 语句
        break; // 可选
        case value :
        // 语句
        break; // 可选
        // 你可以有任意数量的 case 语句
        default : // 可选
        // 语句
        }
        */

        int num = 5;
        switch (num) {
            case 1:
                System.out.println("第一季度");
                break;
            case 2:
                System.out.println("第二季度");
                break;
            case 3:
                System.out.println("第三季度");
                break;
            case 4:
                System.out.println("第四季度");
                break;
            default:
                System.out.println("非法数字");
        }

    }
}

package com.training.lesson2;

/**
 * 嵌套的if....else
 */
public class DemoIfElse2 {
    public static void main(String[] args) {
        char sex = '中';
        if (sex=='男') {
            System.out.println("男厕所");
        } else {
            if (sex == '女') {
                System.out.println("女厕所");
            }else{
                System.out.println("我就不知道了");
            }
        }
    }
}

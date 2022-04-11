package com.training;

public class lesson4 {
    public static void main(String[] args) {
        /**
         * 0. 加载类元信息
         * 1. 静态成员/属性
         * 2. 静态代码块
         * 3. 类代码块
         * 4. 构造函数
         */
        AnimalOld animalOld1 = new AnimalOld("Tom");
        animalOld1.setType("CAT");
        animalOld1.eat();

        AnimalOld animalOld2 = new AnimalOld("Jerry");
        animalOld2.setType("RAT");
        animalOld2.eat();
    }
}

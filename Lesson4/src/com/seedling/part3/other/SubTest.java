package com.seedling.part3.other;

import com.seedling.part3.Test;

/**
 * 在不同的包，不同的类，是子类
 */
public class SubTest extends Test {

    public void func(){
        System.out.println("j:"+j);//protected：受保护的，同类，同包，不同包(限于子类访问)
    }
}

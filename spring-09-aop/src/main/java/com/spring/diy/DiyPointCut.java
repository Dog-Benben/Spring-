package com.spring.diy;

/**
 * @author Orange
 * @create 2021-09-02  18:09
 */
public class DiyPointCut {
    public void before(){
        System.out.println("==============方法执行前===============");
    }
    public void after(){
        System.out.println("===============方法执行后==============");
    }
}

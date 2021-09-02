package com.spring.demo01;

/**
 * @author Orange
 * @create 2021-09-01  9:10
 */
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}

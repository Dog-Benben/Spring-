package com.spring.pojo;
/**
 * @author Orange
 * @create 2021-08-21  15:26
 */
public class UserT {
    private String name;

    public UserT(){
        System.out.println("UserT的无参构造！");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}

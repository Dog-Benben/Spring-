package com.spring.demo01;

/**
 * @author Orange
 * @create 2021-09-01  9:11
 */
//我要租房子
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东出租房子，但是呢？代理角色一般会有一些附属操作！
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接面对中介即可！
        proxy.rent();

    }
}

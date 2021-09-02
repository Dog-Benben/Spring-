package com.spring.demo01;

/**
 * @author Orange
 * @create 2021-09-01  9:12
 */
//代理有个原则：尽量使用组合的方式获取房东不要使用继承的方式获取房东方法
public class Proxy implements Rent{
    private Host host;//组合

    public Proxy(){}
    public Proxy(Host host){
        this.host=host;
    }

    @Override
    public void rent() {
        seekHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seekHouse(){
        System.out.println("中介带你去看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //签合同
    public void hetong(){
        System.out.println("签租赁合同");
    }
}

package com.spring.demo02;

/**
 * @author Orange
 * @create 2021-09-01  9:50
 */
//客户
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        //使用代理模式添加日志
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}

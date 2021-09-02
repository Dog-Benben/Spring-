package com.spring.demo04;

import com.spring.demo02.UserService;
import com.spring.demo02.UserServiceImpl;

/**
 * @author Orange
 * @create 2021-09-02  14:30
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);//设置要代理的对象
        //动态生成代理
        UserService proxy = (UserService) pih.getProxy();
        proxy.query();
    }
}

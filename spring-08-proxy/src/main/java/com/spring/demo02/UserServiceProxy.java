package com.spring.demo02;

/**
 * @author Orange
 * @create 2021-09-01  9:52
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;
    //不建议使用构造器获取真实角色，使用set方法
//    public Proxy(){}
//    public Proxy(UserServiceImpl userService){
//        this.userService=userService;
//    }


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("[Debug]使用了"+msg+"()方法");
    }
}

package com.spring.demo02;

/**
 * @author Orange
 * @create 2021-09-01  9:47
 */
//真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        //当要增加日志时候，如果方法多就要修改所以方法加日志
        //我们修代码原则：经理不要修改源代码，--->做一个代理
        //System.out.println("调用了add()方法");

        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }

    //为什么添加一个日志，不在这里写要弄个代理写，这样不是更麻烦吗？
    //如果在源代码写在企业是一个大忌，如果源代码写改变了业务逻辑，运行不了等等。。。
}

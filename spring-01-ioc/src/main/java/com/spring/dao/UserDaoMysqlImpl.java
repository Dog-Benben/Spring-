package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  21:03
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}

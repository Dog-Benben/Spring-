package com.spring.dao;

/**
 * @author Orange
 * @create 2021-08-20  21:08
 */
public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据！");
    }
}

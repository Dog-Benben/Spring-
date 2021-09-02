package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.dao.UserDaoOracleImpl;

/**
 * @author Orange
 * @create 2021-08-20  20:52
 */
public class UserServiceImpl implements UserService{
    /**
     * 业务层调dao层：组合
     */
    //如果用户要求需求变化，就需要用户自己手段变化了
//    private  UserDao userDao=new UserDaoImpl();
//    private  UserDao userDao=new UserDaoMysqlImpl();
//    private  UserDao userDao=new UserDaoOracleImpl();
    private  UserDao userDao;
    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUSer() {
        userDao.getUser();
    }
}

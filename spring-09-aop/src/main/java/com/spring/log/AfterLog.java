package com.spring.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author Orange
 * @create 2021-09-02  16:54
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"类"+"执行了"+method.getName()+"方法，返回的结果为："+returnValue);
    }
}

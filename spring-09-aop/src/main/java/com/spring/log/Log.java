package com.spring.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Orange
 * @create 2021-09-02  16:48
 */
public class Log implements MethodBeforeAdvice {

    @Override
    /**
     * method：要执行的目标对象的方法
     * args:参数
     * target:目标对象
     */
    public void before(Method method, Object[] ags, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行了");
    }
}

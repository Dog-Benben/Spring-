package com.spring.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Orange
 * @create 2021-09-02  19:58
 */
//方式三：使用注解方式实现aop

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=========方法执行前=========");
    }

    @After("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法执行后的=======");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入点：
    @Around("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp){
        System.out.println("环绕前");

        try {
            Signature signature = jp.getSignature();//获取签名
            System.out.println("signature:"+signature);
            //执行方法
            Object proceed = jp.proceed();

            System.out.println("环绕后");
            System.out.println(proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

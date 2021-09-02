package com.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Orange
 * @create 2021-08-31  22:00
 */
//@Component  组件的意思
//等价于 <bean id = "user" class="com.spring.pojo"/>
@Component
@Scope("singleton")
public class User {
    public String name;

    /**
     * @Value("帅哥") 相当于
     *<bean id="user" class="com.spring.pojo.User">
     *    <property name="name" value="帅哥"></property>
     *</bean>
     */
    @Value("帅哥")
    public void setName(String name) {
        this.name = name;
    }
}

package com.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * @author Orange
 * @create 2021-08-24  10:39
 */
public class People {
    private String name;
    private int age;
//    @Autowired
//    @Qualifier(value = "dog22")
    @Resource(name = "dog2")
    private Dog dog;
    @Resource
    private Cat cat;

//    public People(@Nullable String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}

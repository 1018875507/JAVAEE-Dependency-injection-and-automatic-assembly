package org.haut.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class Animal {
//    @Autowired(required = false)
//    private Cat cat;
//    @Autowired(required = false)
//    private Dog dog;
//    @Value("李俊")
//    private String name;

//    @Autowired(required = false)
//    @Qualifier(value="cat2")
//    private Cat cat;
//    @Autowired(required = false)
//    @Qualifier(value="dog2")
//    private Dog dog;
//    @Value("李俊")
//    private String name;

    @Resource
    private Cat cat;
    @Resource
    private Dog dog;
    @Value("李俊")
    private String name;




    @Override
    public String toString() {
        return "Animal{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
